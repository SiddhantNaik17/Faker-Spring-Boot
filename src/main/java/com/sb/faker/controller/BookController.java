package com.sb.faker.controller;

import com.sb.faker.model.Book;
import com.sb.faker.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books")
    public List<Book> listBook() {
        return bookService.listBooks();
    }
}
