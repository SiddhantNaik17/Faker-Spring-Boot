package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private FakerApiService<Address> fakerApiService;

    private static final String resource = "addresses";

    public Page<Address> list(DefaultQueryParameters parameters, Pageable pageable) {
        return fakerApiService.list(resource, parameters, pageable);
    }
}