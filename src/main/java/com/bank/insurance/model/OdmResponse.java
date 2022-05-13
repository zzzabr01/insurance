package com.bank.insurance.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
 public class OdmResponse {

    private String calculationType;
    private String ruleCode;
    private  String __DecisionID__;
    private String calculationCode;
    private String paymentAmount;
}
