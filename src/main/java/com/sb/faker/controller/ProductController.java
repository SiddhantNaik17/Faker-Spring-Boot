package com.sb.faker.controller;

import com.sb.faker.controller.parameter.ProductQueryParameters;
import com.sb.faker.model.Product;
import com.sb.faker.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "FakerAPI")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Page<Product> list(@ParameterObject ProductQueryParameters parameters, @ParameterObject Pageable pageable) {
        return productService.list(parameters, pageable);
    }
}
