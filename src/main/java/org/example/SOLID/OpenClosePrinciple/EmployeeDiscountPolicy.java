package org.example.SOLID.OpenClosePrinciple;

public class EmployeeDiscountPolicy implements DiscountPolicy {
    @Override public boolean supports(String customerType) {
        return "EMPLOYEE".equalsIgnoreCase(customerType);
    }
    @Override public double apply(double amount) {
        return amount * 0.70;
    }
}