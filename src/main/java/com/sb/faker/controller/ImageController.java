package com.sb.faker.controller;

import com.sb.faker.controller.parameter.ImageQueryParameters;
import com.sb.faker.model.Image;
import com.sb.faker.service.ImageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "FakerAPI")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("/images")
    public Page<Image> list(@ParameterObject ImageQueryParameters parameters, @ParameterObject Pageable pageable) {
        return imageService.list(parameters, pageable);
    }
}
