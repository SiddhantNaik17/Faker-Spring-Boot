package com.sb.faker.controller.parameter;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DefaultQueryParameters {

    @Schema(defaultValue = "en_US", allowableValues = {"en_US", "en_IN"})
    @Parameter(description = "This parameter means the language of the API response we want to get and accept the locale format.")
    protected String locale;

    @Min(1)
    @Max(1000)
    @Schema(defaultValue = "10")
    @Parameter(description = "This parameter means the number of rows we want to obtain and accept only integers. If you request more than 1000 rows (maximum) the system will return 1000 rows anyway.")
    protected int quantity;

    @Parameter(description = "This parameter accept an integer and allows to get always the same results. So, executing the same request with _seed parameter set to the same value (ex. 12345) the results will never change.")
    protected String seed;

    public Map<String, String> getUriVariables() {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("_locale", this.locale);
        uriVariables.put("_quantity", String.valueOf(this.quantity));
        uriVariables.put("_seed", this.seed);
        return uriVariables;
    }
}