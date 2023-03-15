package com.sb.faker.service;

import com.sb.faker.model.Book;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private RestTemplate restTemplate;

    private String resourceUrl = "https://fakerapi.it/api/v1/books";

    public List<Book> listBooks() {
        FakerApiResponse response = restTemplate.exchange(resourceUrl, HttpMethod.GET, null, FakerApiResponse.class).getBody();
        return (List<Book>)(List<?>)response.getData();
    }
}