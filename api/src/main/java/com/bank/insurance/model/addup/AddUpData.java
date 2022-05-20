package com.bank.insurance.model.addup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AddUpData {

    @JsonProperty("add_ups")
   private List<AddUpInfo> addUps;
}
