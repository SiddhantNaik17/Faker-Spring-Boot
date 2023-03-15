package com.sb.faker.controller;

import com.sb.faker.model.Address;
import com.sb.faker.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/addresses")
    public List<Address> listAddresses() {
        return addressService.listAddresses();
    }
}
