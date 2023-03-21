package com.sb.faker.controller;

import com.sb.faker.controller.parameter.ProductQueryParameters;
import com.sb.faker.model.ApiResponse;
import com.sb.faker.model.Product;
import com.sb.faker.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "FakerAPI")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ApiResponse<List<Product>> list(@ParameterObject ProductQueryParameters parameters) {
        List<Product> productList = productService.list(parameters);
        return new ApiResponse<>(productList.size(), productList);
    }
}
