package com.bank.insurance.model.addup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AddUpInfo {
    @JsonProperty("item_name")
    private String itemName;

    @JsonProperty("add_up")
    private AddUpDetail addUp;
}
