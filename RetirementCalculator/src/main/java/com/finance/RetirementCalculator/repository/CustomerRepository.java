package com.finance.RetirementCalculator.repository;
import com.finance.RetirementCalculator.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    // nothing todo
}
