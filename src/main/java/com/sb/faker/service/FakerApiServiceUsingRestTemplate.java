package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakerApiServiceUsingRestTemplate<T> implements FakerApiService<T> {

    @Autowired
    private RestTemplate restTemplate;

    public List<T> list(String resource, DefaultQueryParameters parameters) {
        String url = FakerApiService.build_url(resource, parameters);
        FakerApiResponse<T> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<FakerApiResponse<T>>() {}).getBody();
        return response.getData();
    }
}