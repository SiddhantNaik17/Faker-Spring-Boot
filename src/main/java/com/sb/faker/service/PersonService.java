package com.sb.faker.service;

import com.sb.faker.model.Person;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private RestTemplate restTemplate;

    private String resourceUrl = "https://fakerapi.it/api/v1/persons";

    public List<Person> listPersons() {
        FakerApiResponse response = restTemplate.exchange(resourceUrl, HttpMethod.GET, null, FakerApiResponse.class).getBody();
        return (List<Person>)(List<?>)response.getData();
    }
}