package com.sb.faker.controller;

import com.sb.faker.controller.parameter.ImageQueryParameters;
import com.sb.faker.model.Image;
import com.sb.faker.service.ImageService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("/images")
    public List<Image> list(@ParameterObject ImageQueryParameters parameters) {
        return (List<Image>) imageService.list(parameters);
    }
}