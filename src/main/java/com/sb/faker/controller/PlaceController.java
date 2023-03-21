package com.sb.faker.controller;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.ApiResponse;
import com.sb.faker.model.Place;
import com.sb.faker.service.PlaceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "FakerAPI")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/places")
    public ApiResponse<List<Place>> list(@ParameterObject DefaultQueryParameters parameters) {
        List<Place> placeList = placeService.list(parameters);
        return new ApiResponse<>(placeList.size(), placeList);
    }
}
