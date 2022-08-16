package com.retirementcalc.RetirementCalculator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Customers {
    private int customerID;
    private String customerName;
    private String courseName;
    @Autowired
    private Technologies techDetail;

    public void displayCustomers() {
        System.out.println("Customers Object return successfully");
        techDetail.displayTech();
    }
}
