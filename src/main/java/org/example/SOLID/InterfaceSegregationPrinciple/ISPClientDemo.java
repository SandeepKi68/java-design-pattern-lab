package org.example.SOLID.InterfaceSegregationPrinciple;

// Interfaces
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

// Implementations
class Human implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}

// Client code
public class ISPClientDemo {
    public static void main(String[] args) {
        // Using Human
        Workable humanWorker = new Human();
        Eatable humanEater = new Human();
        Sleepable humanSleeper = new Human();

        humanWorker.work();
        humanEater.eat();
        humanSleeper.sleep();

        // Using Robot
        Workable robotWorker = new Robot();
        robotWorker.work();

        // Notice: Robot is not forced to eat or sleep
    }
}
