package com.sb.faker.model;

import lombok.Data;

@Data
public class CreditCard {

    private String type;
    private String number;
    private String expiration;
    private String owner;
}
