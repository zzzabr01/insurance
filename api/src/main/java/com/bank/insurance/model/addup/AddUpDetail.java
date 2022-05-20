package com.bank.insurance.model.addup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUpDetail {

    @JsonProperty("pay_AMT_RTN")
    private Integer pay_AMT_RTN;

    @JsonProperty("cas1_BONF_AMT")
    private Integer cas1_BONF_AMT;

    @JsonProperty("cas1_DTPE_AMT")
    private Integer cas1_DTPE_AMT;

    @JsonProperty("cas1_RIPD_AMT")
    private Integer cas1_RIPD_AMT;

    @JsonProperty("cas2_4_OVER_PREM")
    private Integer cas2_4_OVER_PREM;

    @JsonProperty("cas2_4_OVER_INT")
    private Integer cas2_4_OVER_INT;

    @JsonProperty("cas2_4_DELA_INT")
    private Integer cas2_4_DELA_INT;

    @JsonProperty("cas1_LI12_AMT_2")
    private Integer cas1_LI12_AMT_2;

    @JsonProperty("tml_TAX")
    private Integer tml_TAX;

    @JsonProperty("tml_2_HI")
    private Integer tml_2_HI;

    @JsonProperty("cas1_INVE_PREM")
    private Integer cas1_INVE_PREM;

    @JsonProperty("cas1_DELA_PREM")
    private Integer cas1_DELA_PREM;

    @JsonProperty("cas1_DELA_INT")
    private Integer cas1_DELA_INT;

    @JsonProperty("cas1_PAIN_INT_AMT")
    private Integer cas1_PAIN_INT_AMT;

    @JsonProperty("cas1_LOMS_AMT")
    private Integer cas1_LOMS_AMT;

    @JsonProperty("cas1_CHECK_AMT")
    private Integer cas1_CHECK_AMT;

    @JsonProperty("cas1_PREM_DISCOUNT")
    private Integer cas1_PREM_DISCOUNT;

    @JsonProperty("cas1_LI_LO_BAL")
    private Integer cas1_LI_LO_BAL;
}
