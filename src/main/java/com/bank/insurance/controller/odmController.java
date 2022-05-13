package com.bank.insurance.controller;


import com.bank.insurance.model.InsuranceType;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/odm")
public class odmController {

    private static final String ODM = "/getCaculation";

    @PostMapping(value = ODM)
    public ResponseEntity<InsuranceType> getCaculation(@Valid @RequestBody InsuranceType insuranceType)
            throws JsonProcessingException {
        System.out.println(insuranceType);
        return ResponseEntity.ok(insuranceType);
    }


}
