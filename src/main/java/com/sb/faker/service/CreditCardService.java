package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class CreditCardService extends FakerApiService {

    public CreditCardService() {
        this.resource = "credit_cards";
    }
}