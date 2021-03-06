package com.bank.insurance.model.insuranceinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceDetail {

    @JsonProperty("lipi_INSU_NO")
    private String lipi_INSU_NO;

    @JsonProperty("lipi_BIRTH")
    private String lipi_BIRTH;

    @JsonProperty("lipi_INSU_BEG_DATE")
    private String lipi_INSU_BEG_DATE;

    @JsonProperty("lipi_INSU_END_DATE")
    private String lipi_INSU_END_DATE;

    @JsonProperty("lipi_LO_MK")
    private String lipi_LO_MK;

    @JsonProperty("lipi_ST")
    private String lipi_ST;

    @JsonProperty("lipi_ST_DATE")
    private String lipi_ST_DATE;

    @JsonProperty("lipi_PREM_YEAR")
    private Integer lipi_PREM_YEAR;

    @JsonProperty("lipi_MAIN_AMT")
    private Integer lipi_MAIN_AMT;
}
