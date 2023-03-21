package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CreditCardService {

    @Autowired
    private FakerApiService<CreditCard> fakerApiService;

    private static final String resource = "credit_cards";

    public Page<CreditCard> list(DefaultQueryParameters parameters, Pageable pageable) {
        return fakerApiService.list(resource, parameters, pageable);
    }
}