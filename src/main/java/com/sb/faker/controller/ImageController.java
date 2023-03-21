package com.sb.faker.controller;

import com.sb.faker.controller.parameter.ImageQueryParameters;
import com.sb.faker.model.ApiResponse;
import com.sb.faker.model.Image;
import com.sb.faker.service.ImageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "FakerAPI")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("/images")
    public ApiResponse<List<Image>> list(@ParameterObject ImageQueryParameters parameters) {
        List<Image> imageList = imageService.list(parameters);
        return new ApiResponse<>(imageList.size(), imageList);
    }
}
