package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class PersonService extends FakerApiService {

    public PersonService() {
        this.resource = "persons";
        this.url += "&_gender={_gender}";
    }
}