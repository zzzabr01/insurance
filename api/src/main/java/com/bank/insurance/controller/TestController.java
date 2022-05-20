package com.bank.insurance.controller;

import com.bank.insurance.model.addup.AddUpData;
import com.bank.insurance.model.insuranceinfo.InsuranceData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Paths;

@RestController
public class TestController {

    @RequestMapping("/productNo10")
    public AddUpData getAddUpData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        AddUpData addUpData = objectMapper.readValue(Paths.get("src/main/resources/addup.json").toFile(), AddUpData.class);
        return addUpData;
    }


    @RequestMapping("/userInsuranceInfo")
    public InsuranceData userInsuranceInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InsuranceData userInsuranceInfo = objectMapper.readValue(Paths.get("src/main/resources/insu_list_sample.json").toFile(), InsuranceData.class);
        return userInsuranceInfo;
    }


}
