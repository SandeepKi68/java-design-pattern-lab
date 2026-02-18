package org.example.UML;

class Animal {
    public void eat(){
        System.out.println("The Animal is eating");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("The Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal Class
        dog.bark(); // Method from Dog class
    }
}