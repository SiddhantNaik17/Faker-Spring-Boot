package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private FakerApiService fakerApiService;

    private final String resource = "addresses";

    public List<Address> list(DefaultQueryParameters parameters) {
        return (List<Address>) fakerApiService.list(resource, parameters);
    }
}