package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class ImageService {

    @Autowired
    private FakerApiService<Image> fakerApiService;

    private static final String resource = "images";

    public Page<Image> list(DefaultQueryParameters parameters, Pageable pageable) {
        return fakerApiService.list(resource, parameters, pageable);
    }
}