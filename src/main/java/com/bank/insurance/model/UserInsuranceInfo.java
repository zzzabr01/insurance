package com.bank.insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInsuranceInfo {

    @JsonProperty("ID")
    private String ID;

    @JsonProperty("INSU_LIST")
    private List<InsuranceInfo> INSU_LIST;

}
