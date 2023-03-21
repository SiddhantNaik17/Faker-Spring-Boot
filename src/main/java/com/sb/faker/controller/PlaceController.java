package com.sb.faker.controller;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Place;
import com.sb.faker.service.PlaceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "FakerAPI")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/places")
    public Page<Place> list(@ParameterObject DefaultQueryParameters parameters, @ParameterObject Pageable pageable) {
        return placeService.list(parameters, pageable);
    }
}
