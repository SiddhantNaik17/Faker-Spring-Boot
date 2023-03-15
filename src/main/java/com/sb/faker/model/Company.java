package com.sb.faker.model;

import lombok.Data;

import java.util.List;

@Data
public class Company {

    private Long id;
    private String name;
    private String email;
    private String vat;
    private String phone;
    private String country;
    private List<Address> addresses;
    private String website;
    private String image;
    private Person contact;
}
