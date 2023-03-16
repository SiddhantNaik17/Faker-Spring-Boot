package com.sb.faker.controller;

import com.sb.faker.controller.parameter.PersonQueryParameters;
import com.sb.faker.model.Person;
import com.sb.faker.service.PersonService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> list(@ParameterObject PersonQueryParameters parameters) {
        return (List<Person>) personService.list(parameters);
    }
}
