package com.sb.faker.model;

import lombok.Data;

@Data
public class Book {

    private Long id;
    private String title;
    private String author;
    private String genre;
    private String description;
    private String isbn;
    private String image;
    private String published;
    private String publisher;
}
