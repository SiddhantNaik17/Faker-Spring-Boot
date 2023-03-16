package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class CompanyService extends FakerApiService {

    public CompanyService() {
        this.resource = "companies";
    }
}