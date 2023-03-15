package com.sb.faker.model;

import lombok.Data;

import java.util.List;

@Data
public class Person {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String birthday;
    private String gender;
    private Address address;
    private String website;
    private String image;
}
