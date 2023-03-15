package com.sb.faker.controller;

import com.sb.faker.model.Company;
import com.sb.faker.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/companies")
    public List<Company> listCompanies() {
        return companyService.listCompanies();
    }
}
