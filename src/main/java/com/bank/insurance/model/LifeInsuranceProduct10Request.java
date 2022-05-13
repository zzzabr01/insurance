package com.bank.insurance.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LifeInsuranceProduct10Request {

    private AddUpForProductNo10 addUpForProductNo10;

    private InsuranceInfo userInsuranceInfo;

    private String accidentReason;

    private Date caseAccidentDate;

    private String productNo;
}
