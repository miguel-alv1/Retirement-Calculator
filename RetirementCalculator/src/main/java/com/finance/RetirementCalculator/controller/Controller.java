package com.finance.RetirementCalculator.controller;
import com.finance.RetirementCalculator.entity.Customer;
import com.finance.RetirementCalculator.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/customers")
    public Customer save(@RequestBody Customer customer) {
        // in case an id is passed in the JSON payload so as to not update
        // an existing entry
        customer.setId(0);

        return customerService.save(customer);
    }

    @PutMapping("/customers")
    public Customer update(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping("/customers/{customer_id}")
    public void deleteById(@PathVariable int customer_id) {
        customerService.deleteById(customer_id);
    }
}