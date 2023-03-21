package com.sb.faker.controller.parameter;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Map;

@Data
public class ProductQueryParameters extends DefaultQueryParameters {

    @Schema(defaultValue = "0.01")
    @Parameter(description = "number in format 10.35")
    private double price_min = 0.01;

    @Schema(defaultValue = "1000000.0")
    @Parameter(description = "number in format 10.35")
    private double price_max = 1000000;

    @Schema(defaultValue = "22")
    @Parameter(description = "percentage")
    private int taxes = 22;

    @Schema(defaultValue = "integer", allowableValues = {"integer", "string", "uuid"})
    @Parameter(description = "categories")
    private String categories_type;

    public Map<String, String> getUriVariables() {
        Map<String, String> uriVariables = super.getUriVariables();
        uriVariables.put("_price_min", String.valueOf(this.price_min));
        uriVariables.put("_price_max", String.valueOf(this.price_max));
        uriVariables.put("_taxes", String.valueOf(this.taxes));
        uriVariables.put("_categories_type", this.categories_type);
        return uriVariables;
    }
}
