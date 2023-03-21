package com.sb.faker.service;

import com.sb.faker.controller.parameter.DefaultQueryParameters;

import java.util.List;
import java.util.Map;

public interface FakerApiService<T> {

    String BASE_URL = "https://fakerapi.it/api/v1";
    List<T> list(String resource, DefaultQueryParameters parameters);

    static String build_url(String resource, DefaultQueryParameters parameters) {
        Map<String, String> uriVariables = parameters.getUriVariables();
        String url = BASE_URL + "/" + resource + "/?";
        for (var entry: uriVariables.entrySet()) {
            if (entry.getValue() != null)
                url += entry.getKey() + "=" + entry.getValue() + "&";
        }
        return url;
    }
}
