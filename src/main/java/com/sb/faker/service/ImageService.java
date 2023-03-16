package com.sb.faker.service;

import org.springframework.stereotype.Service;


@Service
public class ImageService extends FakerApiService {

    public ImageService() {
        this.resource = "images";
        this.url += "&_type={_type}&_width={_width}&_height={_height}";
    }
}