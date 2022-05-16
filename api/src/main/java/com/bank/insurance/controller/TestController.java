package com.bank.insurance.controller;

import com.bank.insurance.model.AddUpForProductNo10;
import com.bank.insurance.model.UserInsuranceInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Paths;

@RestController
public class TestController {

    @RequestMapping("/productNo10")
    public AddUpForProductNo10 productNo10() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        AddUpForProductNo10 productNo10 = objectMapper.readValue(Paths.get("src/main/resources/addup.json").toFile(), AddUpForProductNo10.class);
        return productNo10;
    }


    @RequestMapping("/userInsuranceInfo")
    public UserInsuranceInfo userInsuranceInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserInsuranceInfo userInsuranceInfo = objectMapper.readValue(Paths.get("src/main/resources/insu_list_sample.json").toFile(), UserInsuranceInfo.class);
        return userInsuranceInfo;
    }


}
