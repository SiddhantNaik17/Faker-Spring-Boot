package com.sb.faker.service;

import com.sb.faker.model.Address;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class AddressService {

    @Autowired
    private RestTemplate restTemplate;

    private String resourceUrl = "https://fakerapi.it/api/v1/addresses";

    public List<Address> listAddresses() {
        FakerApiResponse response = restTemplate.exchange(resourceUrl, HttpMethod.GET, null, FakerApiResponse.class).getBody();
        return (List<Address>)(List<?>)response.getData();
    }
}