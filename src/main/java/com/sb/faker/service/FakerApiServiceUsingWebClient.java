package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.FakerApiResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Primary
public class FakerApiServiceUsingWebClient<T> implements FakerApiService<T> {

    public Page<T> list(String resource, DefaultQueryParameters parameters, Pageable pageable) {
        String url = FakerApiService.build_url(resource, parameters, pageable);
        FakerApiResponse<T> response = WebClient.create()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<FakerApiResponse<T>>() {})
                .block();
        return paginate(response.getData(), pageable);
    }
}
