package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class ProductService extends FakerApiService {

    public ProductService() {
        this.resource = "products";
        this.url += "&_price_min={_price_min}&_price_max={_price_max}&_taxes={_taxes}&_categories_type={_categories_type}";
    }
}