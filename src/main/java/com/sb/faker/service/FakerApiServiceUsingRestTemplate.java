package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakerApiServiceUsingRestTemplate implements FakerApiService {

    @Autowired
    private RestTemplate restTemplate;

    public List<?> list(String resource, DefaultQueryParameters parameters) {
        String url = FakerApiService.build_url(resource, parameters);

        FakerApiResponse response = restTemplate.getForObject(url, FakerApiResponse.class);
        return response.getData();
    }
}