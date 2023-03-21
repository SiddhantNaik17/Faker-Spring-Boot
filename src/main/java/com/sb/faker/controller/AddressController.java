package com.sb.faker.controller;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.Address;
import com.sb.faker.model.ApiResponse;
import com.sb.faker.service.AddressService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "FakerAPI")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses")
    public ApiResponse<List<Address>> list(@ParameterObject DefaultQueryParameters parameters) {
        List<Address> addressList = addressService.list(parameters);
        return new ApiResponse<>(addressList.size(), addressList);
    }
}
