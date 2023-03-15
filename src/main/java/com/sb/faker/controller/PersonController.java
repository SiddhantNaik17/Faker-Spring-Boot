package com.sb.faker.controller;

import com.sb.faker.model.Person;
import com.sb.faker.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/persons")
    public List<Person> listPerson() {
        return personService.listPersons();
    }
}
