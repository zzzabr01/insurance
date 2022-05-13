package com.bank.insurance.service;

import com.bank.insurance.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OdmServiceImpl {
    private static final String ODMURL = "http://nanchan.myds.me:9060/DecisionService/rest/LifeInsuranceProductNo10/1.0/ProductNo10WithDeathAndTotallyDisabilityBenefit/1.1";
    private RestTemplate restTemplate;

    public ResponseEntity<?> process(InsuranceType insuranceType) throws IOException {

        String id = insuranceType.getInsuranceNo();
        Date caseAccidentDate = insuranceType.getDieDate();
        String accidentReason = insuranceType.getReason();
        List<String> application = insuranceType.getApplication();

        try {
            LifeInsuranceProduct10Request lifeInsuranceProduct10Request = LifeInsuranceProduct10Request.builder().productNo("").caseAccidentDate(caseAccidentDate).accidentReason(accidentReason).addUpForProductNo10(addUpForProductNo10()).build();

            HttpPost requestPost = new HttpPost(ODMURL);
            StringEntity stringEntity = new StringEntity(new ObjectMapper().writeValueAsString(lifeInsuranceProduct10Request),
                      ContentType.APPLICATION_JSON);

            System.out.println(new ObjectMapper().writeValueAsString(lifeInsuranceProduct10Request));

            CloseableHttpClient httpClient = HttpClients.createDefault();
            CloseableHttpResponse response;

            response = httpClient.execute(requestPost);
            String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
            System.out.println(responseBody);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
