package com.sb.faker.model;

import lombok.Data;

@Data
public class Address {

    private Long id;
    private String street;
    private String streetName;
    private String buildingNumber;
    private String city;
    private String zipcode;
    private String country;
    private String county_code;
    private double latitude;
    private double longitude;
}
