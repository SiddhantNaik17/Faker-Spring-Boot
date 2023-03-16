package com.sb.faker.model;

import lombok.Data;

import java.util.List;

@Data
public class Product {

    private Long id;
    private String name;
    private String description;
    private String ean;
    private String upc;
    private String image;
    private List<Image> images;
    private double net_price;
    private String taxes;
    private Person price;
    private List<String> categories;
    private List<String> tags;
}
