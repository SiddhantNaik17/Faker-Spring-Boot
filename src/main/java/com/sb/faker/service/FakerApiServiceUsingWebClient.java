package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Primary
public class FakerApiServiceUsingWebClient implements FakerApiService {

    public List<?> list(String resource, DefaultQueryParameters parameters) {
        String url = FakerApiService.build_url(resource, parameters);

        FakerApiResponse response = WebClient.create()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(FakerApiResponse.class)
                .block();
        return response.getData();
    }
}
