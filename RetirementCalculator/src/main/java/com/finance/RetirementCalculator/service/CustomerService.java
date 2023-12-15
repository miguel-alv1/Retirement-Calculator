package com.finance.RetirementCalculator.service;
import com.finance.RetirementCalculator.entity.Customer;
import java.util.List;




public interface CustomerService {
    List<Customer> findAll();

    // Customer findCustomer(int id);

    Customer save(Customer customer);
    
    // void deleteById(int id);
    
}
