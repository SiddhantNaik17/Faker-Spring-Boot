package com.sb.faker.controller;

import com.sb.faker.controller.parameter.DefaultQueryParameters;
import com.sb.faker.model.ApiResponse;
import com.sb.faker.model.CreditCard;
import com.sb.faker.service.CreditCardService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "FakerAPI")
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @GetMapping("/credit_cards")
    public ApiResponse<List<CreditCard>> list(@ParameterObject DefaultQueryParameters parameters) {
        List<CreditCard> creditCardList = creditCardService.list(parameters);
        return new ApiResponse<>(creditCardList.size(), creditCardList);
    }
}
