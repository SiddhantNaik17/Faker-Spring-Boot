package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CreditCardService {

    @Autowired
    private FakerApiService fakerApiService;

    private final String resource = "credit_cards";

    public List<CreditCard> list(DefaultQueryParameters parameters) {
        return (List<CreditCard>) fakerApiService.list(resource, parameters);
    }
}