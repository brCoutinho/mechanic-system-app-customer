package com.br.coutinho.mechanic.app.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mechanic/api/customer")
public class CustomerController {

    @GetMapping("")
    private String getAll(){
        return "Customer";
    }
}
