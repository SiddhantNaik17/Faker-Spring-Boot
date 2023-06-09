package com.sb.faker.controller;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Book;
import com.sb.faker.service.BookService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "FakerAPI")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public Page<Book> list(@ParameterObject DefaultQueryParameters parameters, @ParameterObject Pageable pageable) {
        return bookService.list(parameters, pageable);
    }
}
