package com.finance.RetirementCalculator.controller;
import com.finance.RetirementCalculator.entity.Customer;
import com.finance.RetirementCalculator.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private CustomerService customerService;

    @Autowired
    public Controller(CustomerService theCustomerService) {
        customerService = theCustomerService;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome!";
    }

    @GetMapping("/customers")
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}