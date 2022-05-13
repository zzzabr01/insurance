package com.bank.insurance.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
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
