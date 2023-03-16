package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class PlaceService extends FakerApiService {

    public PlaceService() {
        this.resource = "places";
    }
}