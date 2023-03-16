package com.sb.faker.controller;

import com.sb.faker.controller.parameter.ProductQueryParameters;
import com.sb.faker.model.Product;
import com.sb.faker.service.ProductService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> list(@ParameterObject ProductQueryParameters parameters) {
        return (List<Product>) productService.list(parameters);
    }
}
