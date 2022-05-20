package com.bank.insurance.model;

import com.bank.insurance.model.addup.AddUpDetail;
import com.bank.insurance.model.insuranceinfo.InsuranceDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
 public class LifeInsuranceClaimToOdmRequest {

    private AddUpDetail addUpForProductNo10;

    private InsuranceDetail insuranceInfo;

    private String accidentReason;

    private Date caseAccidentDate;

    private String productNo;

    private String applyItem;
}
