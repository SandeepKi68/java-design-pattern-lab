package org.example.SOLID.OpenClosePrinciple;


public class PremiumDiscountPolicy implements DiscountPolicy {
    @Override public boolean supports(String customerType) {
        return "PREMIUM".equalsIgnoreCase(customerType);
    }
    @Override public double apply(double amount) {
        return amount * 0.90;
    }
}