package com.sb.faker.service;

import com.sb.faker.model.FakerApiResponse;
import com.sb.faker.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class CompanyService {

    @Autowired
    private RestTemplate restTemplate;

    private String resourceUrl = "https://fakerapi.it/api/v1/companies";

    public List<Company> listCompanies() {
        FakerApiResponse response = restTemplate.exchange(resourceUrl, HttpMethod.GET, null, FakerApiResponse.class).getBody();
        return (List<Company>)(List<?>)response.getData();
    }
}