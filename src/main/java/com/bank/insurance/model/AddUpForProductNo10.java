package com.bank.insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUpForProductNo10 {

    @JsonProperty("PAY_AMT_RTN")
    private Integer PAY_AMT_RTN;

    @JsonProperty("CAS1_BONF_AMT")
    private Integer CAS1_BONF_AMT;

    @JsonProperty("CAS1_DTPE_AMT")
    private Integer CAS1_DTPE_AMT;

    @JsonProperty("CAS1_RIPD_AMT")
    private Integer CAS1_RIPD_AMT;

    @JsonProperty("CAS2_4_OVER_PREM")
    private Integer CAS2_4_OVER_PREM;

    @JsonProperty("CAS2_4_OVER_INT")
    private Integer CAS2_4_OVER_INT;

    @JsonProperty("CAS2_4_DELA_INT")
    private Integer CAS2_4_DELA_INT;

    @JsonProperty("CAS1_LI12_AMT_2")
    private Integer CAS1_LI12_AMT_2;

    @JsonProperty("TML_TAX")
    private Integer TML_TAX;

    @JsonProperty("TML_2_HI")
    private Integer TML_2_HI;

    @JsonProperty("CAS1_INVE_PREM")
    private Integer CAS1_INVE_PREM;

    @JsonProperty("CAS1_DELA_PREM")
    private Integer CAS1_DELA_PREM;

    @JsonProperty("CAS1_DELA_INT")
    private Integer CAS1_DELA_INT;

    @JsonProperty("CAS1_PAIN_INT_AMT")
    private Integer CAS1_PAIN_INT_AMT;

    @JsonProperty("CAS1_LOMS_AMT")
    private Integer CAS1_LOMS_AMT;

    @JsonProperty("CAS1_CHECK_AMT")
    private Integer CAS1_CHECK_AMT;

    @JsonProperty("CAS1_PREM_DISCOUNT")
    private Integer CAS1_PREM_DISCOUNT;

    @JsonProperty("CAS1_LI_LO_BAL")
    private Integer CAS1_LI_LO_BAL;
}
