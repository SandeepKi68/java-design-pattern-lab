package org.example.SOLID.OpenClosePrinciple;

public class RegularDiscountPolicy implements DiscountPolicy{

    @Override
    public boolean supports(String customerType) {
        return "REGULAR".equalsIgnoreCase(customerType);
    }

    @Override
    public double apply(double amount) {
        return amount * 0.95;
    }
}