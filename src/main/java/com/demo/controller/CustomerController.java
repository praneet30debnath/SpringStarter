package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@Controller
//@RequestMapping("/sample")
public class CustomerController {

    @Autowired
    CustomerService cService;

    @GetMapping("/hello")
    @ResponseBody
    public Customer hello() {
        return cService.printCustomer();
    }
}
