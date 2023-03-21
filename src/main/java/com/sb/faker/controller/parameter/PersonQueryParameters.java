package com.sb.faker.controller.parameter;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Map;

@Data
public class PersonQueryParameters extends DefaultQueryParameters {

    @Schema(allowableValues = {"male", "female"})
    @Parameter(description = "This parameter means the gender of the people that we want to obtain.")
    private String gender;

    public Map<String, String> getUriVariables() {
        Map<String, String> uriVariables = super.getUriVariables();
        uriVariables.put("_gender", this.gender);
        return uriVariables;
    }
}
