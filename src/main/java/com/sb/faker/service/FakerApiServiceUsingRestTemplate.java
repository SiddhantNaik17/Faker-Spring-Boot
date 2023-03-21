package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakerApiServiceUsingRestTemplate<T> implements FakerApiService<T> {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Page<T> list(String resource, DefaultQueryParameters parameters, Pageable pageable) {
        String url = FakerApiService.build_url(resource, parameters, pageable);
        FakerApiResponse<T> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<FakerApiResponse<T>>() {}).getBody();
        return paginate(response.getData(), pageable);
    }

}