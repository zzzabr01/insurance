package com.bank.insurance.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Data
public class InsuranceType {

    private String insuranceNo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date dieDate;
    private String reason;
    private List<String> application;


}

