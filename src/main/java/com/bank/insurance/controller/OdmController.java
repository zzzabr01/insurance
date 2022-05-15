package com.bank.insurance.controller;


import com.bank.insurance.model.AddUpForProductNo10;
import com.bank.insurance.model.InsuranceInfo;
import com.bank.insurance.model.InsuranceType;
import com.bank.insurance.model.UserInsuranceInfo;
import com.bank.insurance.service.OdmServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/odm")
public class OdmController {

    @Autowired
    private OdmServiceImpl odmServiceImpl;

    private static final String ODM = "/getCalculation";

    @PostMapping(value = ODM)
    public ResponseEntity<?> getCalculation(@Valid @RequestBody InsuranceType insuranceType)
            throws IOException {
        return odmServiceImpl.process(insuranceType);
    }




}
