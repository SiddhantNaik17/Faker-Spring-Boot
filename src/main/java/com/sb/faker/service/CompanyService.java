package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyService {

    @Autowired
    private FakerApiService<Company> fakerApiService;

    private static final String resource = "companies";

    public List<Company> list(DefaultQueryParameters parameters) {
        return fakerApiService.list(resource, parameters);
    }
}