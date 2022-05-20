package com.bank.insurance.service;

import com.bank.insurance.model.*;
import com.bank.insurance.model.addup.AddUpData;
import com.bank.insurance.model.addup.AddUpDetail;
import com.bank.insurance.model.addup.AddUpInfo;
import com.bank.insurance.model.insuranceinfo.InsuranceData;
import com.bank.insurance.model.insuranceinfo.InsuranceDetail;
import com.bank.insurance.model.insuranceinfo.UserInsuranceInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

@Service
public class OdmServiceImpl {
    private static final String ODM＿URL =
            "http://nanchan.myds.me:9060/DecisionService/rest/LifeInsuranceProductNo10/1.0/ProductNo10WithDeathAndTotallyDisabilityBenefit/1.15";
    private RestTemplate restTemplate;
    private HttpHeaders headers;

    public ResponseEntity<?> process(InsuranceClaimForm insuranceClaimForm) throws IOException {

        String id = insuranceClaimForm.getId();
        Date caseAccidentDate = insuranceClaimForm.getDieDate();
        String accidentReason = insuranceClaimForm.getAccidentReason();
        String applyItem = insuranceClaimForm.getApplyItem();
        // 取的insu_list 資訊
        InsuranceData insuranceData = userInsuranceInfo();
        List<UserInsuranceInfo> userInsuranceInfoList = insuranceData.getCUST();
        // 取得對應的id資訊
        UserInsuranceInfo userInsuranceInfo = userInsuranceInfoList.stream()
                .filter(insuranceInfo -> insuranceInfo.getID().equals(id))
                .findFirst()
                .orElse(null);
        if(userInsuranceInfo == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("身分證字號不存在");
        }
        InsuranceDetail insuranceDetailParam = userInsuranceInfo.getINSU_LIST().get(0);
        // 取得保單號碼的前兩碼作為商品代號
        String productNo = insuranceDetailParam.getLipi_INSU_NO().substring(0, 2);

        // 計算資訊
        AddUpData addUpData = getAddUpData();
        List<AddUpInfo> addUpInfoList = addUpData.getAddUps();
        AddUpInfo addUpInfo = addUpInfoList.stream()
                .filter(info -> info.getItemName().equals(productNo))
                .findFirst()
                .orElse(null);
        if(addUpInfo == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("商品代號-" + productNo + "不存在");
        }
        AddUpDetail addUpDetail = addUpInfo.getAddUp();

        String responseBody = null;

        try {
            LifeInsuranceClaimToOdmRequest lifeInsuranceProduct10Request = LifeInsuranceClaimToOdmRequest.builder()
                    .productNo(productNo).caseAccidentDate(caseAccidentDate).applyItem(applyItem)
                    .accidentReason(accidentReason).addUpForProductNo10(addUpDetail).insuranceInfo(insuranceDetailParam).build();
            StringEntity stringEntity = new StringEntity(new ObjectMapper().writeValueAsString(lifeInsuranceProduct10Request),
                    ContentType.APPLICATION_JSON);


            HttpPost requestPost = new HttpPost(ODM＿URL);
            requestPost.setHeader("Content-Type", "application/json");
            requestPost.setEntity(stringEntity);
            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("JSON:  " + objectMapper.writeValueAsString(lifeInsuranceProduct10Request));
            CloseableHttpClient httpClient = HttpClients.createDefault();
            CloseableHttpResponse response;
            response = httpClient.execute(requestPost);
            responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(responseBody);
    }


    public AddUpData getAddUpData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        AddUpData addUpData = objectMapper.readValue(Paths.get("src/main/resources/addup.json").toFile(), AddUpData.class);
        return addUpData;
    }


    public InsuranceData userInsuranceInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InsuranceData insuranceData = objectMapper.readValue(Paths.get("src/main/resources/insu_list_sample.json").toFile(), InsuranceData.class);
        return insuranceData;
    }

}
