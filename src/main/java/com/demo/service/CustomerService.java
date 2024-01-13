package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;

@Service
public class CustomerService {

    public Customer printCustomer() {
        Customer customer = new Customer(1, "Praneet Debnath", "Hyderabad");
        return customer;
    }
}
