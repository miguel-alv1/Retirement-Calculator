package com.finance.RetirementCalculator.service;
import com.finance.RetirementCalculator.entity.Customer;
import com.finance.RetirementCalculator.exception.CustomerNotFoundException;
import com.finance.RetirementCalculator.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
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
    public Customer findById(int id) {
        Optional<Customer> customer = customerRepo.findById(id);
        
        if (customer.isEmpty()) {
            throw new CustomerNotFoundException("Customer with id: " + id + " not found");
        }
        return customer.get();
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }
    
    @Override
    public void deleteById(int id) {
        System.out.println("deleting entry with id: " + id);
        customerRepo.deleteById(id);
    }
}
