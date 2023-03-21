package com.sb.faker.controller.parameter;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DefaultQueryParameters {

    @Schema(defaultValue = "en_US", allowableValues = {"en_US", "en_IN"})
    @Parameter(description = "This parameter means the language of the API response we want to get and accept the locale format.")
    private String locale;

    @Schema(defaultValue = "1234")
    @Parameter(description = "This parameter accept an integer and allows to get always the same results. So, executing the same request with _seed parameter set to the same value (ex. 12345) the results will never change.")
    private String seed = "1234";

    @Parameter(hidden = true)
    private int quantity;

    public Map<String, String> getUriVariables() {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("_locale", this.locale);
        uriVariables.put("_seed", this.seed);
        uriVariables.put("_quantity", String.valueOf(this.quantity));
        return uriVariables;
    }
}