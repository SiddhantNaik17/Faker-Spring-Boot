package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ImageService {

    @Autowired
    private FakerApiService fakerApiService;

    private final String resource = "images";

    public List<Image> list(DefaultQueryParameters parameters) {
        return (List<Image>) fakerApiService.list(resource, parameters);
    }
}