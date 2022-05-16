package com.bank.insurance.service;

import com.bank.insurance.model.*;
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
            "http://nanchan.myds.me:9060/DecisionService/rest/LifeInsuranceProductNo10/1.0/ProductNo10WithDeathAndTotallyDisabilityBenefit/1.9";
    private RestTemplate restTemplate;
    private HttpHeaders headers;

    public ResponseEntity<?> process(InsuranceType insuranceType) throws IOException {

        String id = insuranceType.getId();
        Date caseAccidentDate = insuranceType.getDieDate();
        String accidentReason = insuranceType.getReason();
        List<String> application = insuranceType.getApplication();
        List<InsuranceInfo> insuranceInfo = userInsuranceInfo().getINSU_LIST();
        InsuranceInfo insuranceInfoParam = insuranceInfo.get(0);
        // 取得保單號碼的前兩碼作為商品代號
        String productNo = insuranceInfoParam.getLipi_INSU_NO().substring(0, 2);
        String responseBody = null;

        try {
            LifeInsuranceProduct10Request lifeInsuranceProduct10Request = LifeInsuranceProduct10Request.builder()
                    .productNo(productNo).caseAccidentDate(caseAccidentDate)
                    .accidentReason(accidentReason).addUpForProductNo10(addUpForProductNo10()).insuranceInfo(insuranceInfoParam).build();
            StringEntity stringEntity = new StringEntity(new ObjectMapper().writeValueAsString(lifeInsuranceProduct10Request),
                    ContentType.APPLICATION_JSON);

            HttpPost requestPost = new HttpPost(ODM＿URL);
            requestPost.setHeader("Content-Type", "application/json");
            requestPost.setEntity(stringEntity);

            CloseableHttpClient httpClient = HttpClients.createDefault();
            CloseableHttpResponse response;
            response = httpClient.execute(requestPost);
            responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(responseBody);
    }


    public AddUpForProductNo10 addUpForProductNo10() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        AddUpForProductNo10 productNo10 = objectMapper.readValue(Paths.get("src/main/resources/addup.json").toFile(), AddUpForProductNo10.class);
        return productNo10;
    }


    public UserInsuranceInfo userInsuranceInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserInsuranceInfo userInsuranceInfo = objectMapper.readValue(Paths.get("src/main/resources/insu_list_sample.json").toFile(), UserInsuranceInfo.class);
        return userInsuranceInfo;
    }

}
