package com.sb.faker.model;

import lombok.Data;

import java.util.List;

@Data
public class FakerApiResponse<T> {

    private String status;
    private String code;
    private int total;
    private List<T> data;
}
