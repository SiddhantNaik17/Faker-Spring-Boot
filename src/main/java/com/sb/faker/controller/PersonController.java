package com.sb.faker.controller;

import com.sb.faker.controller.parameter.PersonQueryParameters;
import com.sb.faker.model.Person;
import com.sb.faker.service.PersonService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "FakerAPI")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public Page<Person> list(@ParameterObject PersonQueryParameters parameters, @ParameterObject Pageable pageable) {
        return personService.list(parameters, pageable);
    }
}
