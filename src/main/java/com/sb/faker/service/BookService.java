package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class BookService extends FakerApiService {

    public BookService() {
        this.resource = "books";
    }
}