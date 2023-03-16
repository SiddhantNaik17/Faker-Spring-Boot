package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;


@Component
public class FakerApiService {

    @Autowired
    protected RestTemplate restTemplate;

    protected String url = "https://fakerapi.it/api/v1/{resource}?_locale={_locale}&_quantity={_quantity}&_seed={_seed}";

    protected String resource;

    public List<?> list(DefaultQueryParameters parameters) {
        Map<String, String> uriVariables = parameters.getUriVariables();
        uriVariables.put("resource", resource);
        FakerApiResponse response = restTemplate.getForObject(url, FakerApiResponse.class, uriVariables);
        return response.getData();
    }
}