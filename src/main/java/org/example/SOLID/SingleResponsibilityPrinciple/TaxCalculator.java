package org.example.SOLID.SingleResponsibilityPrinciple;

public class TaxCalculator {
    public double calculateTax(Employee employee) {
        return employee.getSalary() * 0.2;
    }
}
