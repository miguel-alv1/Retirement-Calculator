package com.retirementcalc.RetirementCalculator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Technologies {
    private int techID;
    private String techName;

    public void displayTech() {
        System.out.println("Technologies Object returned successfully");
    }
}
