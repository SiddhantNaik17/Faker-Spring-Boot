package com.sb.faker.controller;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.ApiResponse;
import com.sb.faker.model.Company;
import com.sb.faker.service.CompanyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "FakerAPI")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public ApiResponse<List<Company>> list(@ParameterObject DefaultQueryParameters parameters) {
        List<Company> companyList = companyService.list(parameters);
        return new ApiResponse<>(companyList.size(), companyList);
    }
}
