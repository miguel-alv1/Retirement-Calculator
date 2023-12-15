package com.finance.RetirementCalculator.service;
import com.finance.RetirementCalculator.entity.Customer;
import com.finance.RetirementCalculator.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{
    
    private CustomerRepository customerRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepository theCustomerRepo) {
        customerRepo = theCustomerRepo;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }
}
