package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private FakerApiService<Book> fakerApiService;

    private static final String resource = "books";

    public List<Book> list(DefaultQueryParameters parameters) {
        return fakerApiService.list(resource, parameters);
    }
}