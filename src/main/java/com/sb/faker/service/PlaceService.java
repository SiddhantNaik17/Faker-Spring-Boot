package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Address;
import com.sb.faker.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlaceService {

    @Autowired
    private FakerApiService<Place> fakerApiService;

    private static final String resource = "places";

    public List<Place> list(DefaultQueryParameters parameters) {
        return fakerApiService.list(resource, parameters);
    }
}