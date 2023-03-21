package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    @Autowired
    private FakerApiService<Person> fakerApiService;

    private static final String resource = "persons";

    public Page<Person> list(DefaultQueryParameters parameters, Pageable pageable) {
        return fakerApiService.list(resource, parameters, pageable);
    }
}