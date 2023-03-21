package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    private FakerApiService<Book> fakerApiService;

    private static final String resource = "books";

    public Page<Book> list(DefaultQueryParameters parameters, Pageable pageable) {
        return fakerApiService.list(resource, parameters, pageable);
    }
}