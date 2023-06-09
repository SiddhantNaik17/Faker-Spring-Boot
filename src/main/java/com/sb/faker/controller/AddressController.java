package com.sb.faker.controller;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Address;
import com.sb.faker.service.AddressService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "FakerAPI")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses")
    public Page<Address> list(@ParameterObject DefaultQueryParameters parameters, @ParameterObject Pageable pageable) {
        return addressService.list(parameters, pageable);
    }
}
