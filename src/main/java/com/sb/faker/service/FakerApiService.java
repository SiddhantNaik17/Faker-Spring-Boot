package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface FakerApiService<T> {

    String BASE_URL = "https://fakerapi.it/api/v1";
    Page<T> list(String resource, DefaultQueryParameters parameters, Pageable pageable);

    static String build_url(String resource, DefaultQueryParameters parameters, Pageable pageable) {
        parameters.setQuantity((int) (pageable.getOffset() + pageable.getPageSize()));
        Map<String, String> uriVariables = parameters.getUriVariables();
        StringBuilder url = new StringBuilder(BASE_URL + "/" + resource + "/?");
        for (var entry: uriVariables.entrySet()) {
            if (entry.getValue() != null)
                url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        return url.toString();
    }

    default Page<T> paginate(List<T> data, Pageable pageable) {
        final int start = (int) pageable.getOffset();
        final int end = Math.min((start + pageable.getPageSize()), data.size());
        return new PageImpl<>(data.subList(start, end), pageable, data.size());
    }

}
