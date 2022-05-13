package com.bank.insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceInfo {

    @JsonProperty("LIPI_INSU_NO")
    private String LIPI_INSU_NO;

    @JsonProperty("LIPI_BIRTH")
    private String LIPI_BIRTH;

    @JsonProperty("LIPI_INSU_BEG_DATE")
    private String LIPI_INSU_BEG_DATE;

    @JsonProperty("LIPI_INSU_END_DATE")
    private String LIPI_INSU_END_DATE;

    @JsonProperty("LIPI_LO_MK")
    private String LIPI_LO_MK;

    @JsonProperty("LIPI_ST")
    private String LIPI_ST;

    @JsonProperty("LIPI_ST_DATE")
    private String LIPI_ST_DATE;

    @JsonProperty("LIPI_PREM_YEAR")
    private String LIPI_PREM_YEAR;

    @JsonProperty("LIPI_MAIN_AMT")
    private String LIPI_MAIN_AMT;
}
