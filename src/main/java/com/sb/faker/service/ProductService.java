package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    private FakerApiService fakerApiService;

    private final String resource = "products";

    public List<Product> list(DefaultQueryParameters parameters) {
        return (List<Product>) fakerApiService.list(resource, parameters);
    }
}