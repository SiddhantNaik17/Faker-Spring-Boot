package com.sb.faker.controller.parameter;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Map;

@Data
public class ImageQueryParameters extends DefaultQueryParameters {

    @Schema(allowableValues = {"any", "animals", "architecture", "nature", "people", "tech", "kittens", "pokemon"})
    @Parameter(description = "This parameter means the type of the images that we want to obtain.")
    private String type;

    @Schema(defaultValue = "640")
    @Parameter(description = "This parameter means the width of the images that we want to obtain.")
    private int width;

    @Schema(defaultValue = "480")
    @Parameter(description = "This parameter means the height of the images that we want to obtain.")
    private int height;

    public Map<String, String> getUriVariables() {
        Map<String, String> uriVariables = super.getUriVariables();
        uriVariables.put("_type", this.type);
        uriVariables.put("_width", String.valueOf(this.width));
        uriVariables.put("_height", String.valueOf(this.height));
        return uriVariables;
    }
}
