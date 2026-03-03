package org.example.SOLID.OpenClosePrinciple;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        DiscountService service = new DiscountService(Arrays.asList(
                new RegularDiscountPolicy(),
                new PremiumDiscountPolicy(),
                new EmployeeDiscountPolicy()
        ));

        System.out.println(service.applyDiscount("REGULAR", 1000));
        System.out.println(service.applyDiscount("PREMIUM", 1000));
        System.out.println(service.applyDiscount("EMPLOYEE", 1000));
    }
}