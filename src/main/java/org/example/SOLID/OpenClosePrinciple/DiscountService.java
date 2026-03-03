package org.example.SOLID.OpenClosePrinciple;

import java.util.List;

public class DiscountService {
    private final List<DiscountPolicy> policies;

    public DiscountService(List<DiscountPolicy> policies) {
        this.policies = policies;
    }

    public double applyDiscount(String customerType, double amount) {
        return policies.stream()
                .filter(p -> p.supports(customerType))
                .findFirst()
                .map(p -> p.apply(amount))
                .orElse(amount);
    }
}