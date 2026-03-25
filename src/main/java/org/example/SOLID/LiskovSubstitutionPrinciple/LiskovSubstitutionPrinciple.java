package org.example.SOLID.LiskovSubstitutionPrinciple;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        sparrow.fly();
        ostrich.eat(); 
    }
}
