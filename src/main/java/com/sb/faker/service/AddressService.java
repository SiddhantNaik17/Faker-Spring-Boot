package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class AddressService extends FakerApiService {

    public AddressService() {
        this.resource = "addresses";
    }
}