package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private FakerApiService<Person> fakerApiService;

    private static final String resource = "persons";

    public List<Person> list(DefaultQueryParameters parameters) {
        return fakerApiService.list(resource, parameters);
    }
}