package org.example.SOLID.LiskovSubstitutionPrinciple;

public class Sparrow implements FlyingBird {
    @Override public void eat() {
        System.out.println("Sparrow is eating seeds.");
    }
    @Override public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

class Ostrich implements Bird {
    @Override public void eat() {
        System.out.println("Ostrich is eating plants.");
    }
}
