package com.retirementcalc.RetirementCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RetirementCalculatorApplication {

	public static void main(String[] args) {
		// Will return an object at the time of execution
		SpringApplication.run(RetirementCalculatorApplication.class, args);

		// telling compiler to return an object of the 'Customers' class - then have to check if it's working
		//Technologies tech = context.getBean(Technologies.class);
//		Customers customer = context.getBean(Customers.class);
//		customer.displayCustomers();
	}
}
