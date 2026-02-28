package org.example.UML;

interface Worker{
    void work();
}
class Employee implements Worker{

    @Override
    public void work() {
        System.out.println("Employee is working");
    }
}

public class Realization {
    public static void main(String[] args) {
        Worker emp = new Employee();

        emp.work();
    }
}