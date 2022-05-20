package com.bank.insurance.model.insuranceinfo;

import com.bank.insurance.model.insuranceinfo.InsuranceDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserInsuranceInfo {

    @JsonProperty("ID")
    private String ID;

    @JsonProperty("INSU_LIST")
    private List<InsuranceDetail> INSU_LIST;
}
