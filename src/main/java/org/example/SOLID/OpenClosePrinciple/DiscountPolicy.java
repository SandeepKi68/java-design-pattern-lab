package org.example.SOLID.OpenClosePrinciple;

public interface DiscountPolicy {
    boolean supports(String customerType);

    double apply(double amount);
}