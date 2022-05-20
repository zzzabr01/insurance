package com.bank.insurance.controller;


import com.bank.insurance.model.InsuranceClaimForm;
import com.bank.insurance.service.OdmServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/odm")
public class OdmController {

    @Autowired
    private OdmServiceImpl odmServiceImpl;

    private static final String ODM = "/getCalculation";

    @PostMapping(value = ODM)
    public ResponseEntity<?> getCalculation(@Valid @RequestBody InsuranceClaimForm insuranceClaimForm)
            throws IOException {
        return odmServiceImpl.process(insuranceClaimForm);
    }




}
