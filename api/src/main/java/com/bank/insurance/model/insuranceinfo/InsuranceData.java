package com.bank.insurance.model.insuranceinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceData {

    @JsonProperty("CUST")
    private List<UserInsuranceInfo> CUST;

}
