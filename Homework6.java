/**
 *Java 1. Homework 6.
 *
 *@author Ivan Iov
 *@version dated Dec 11, 2017
 *@link https://github.com/mrPaulDure/Java1
 */

public class Homework6 {
    public static void main(String[] args) {
        Cat cat = new Cat(50, 1, 5);
        Dog dog = new Dog(100, 3, 10);
        System.out.println("Cat");
        cat.run();
        cat.jump();
        cat.swim();
        System.out.println("Dog");
        dog.run();
        dog.jump();
        dog.swim();
    }
}

abstract class Animal {
    int runValue;
    int jumpValue;
    int swimValue;

    public Animal(int runValue, int jumpValue,int swimValue) {
        this.runValue = runValue;
        this.jumpValue = jumpValue;
        this.swimValue = swimValue;
    }

    abstract public void run();
    abstract public void jump();
    abstract public void swim();
}

class Cat extends Animal {
    private int maxRunValue = 200;
    private int maxJumpValue = 2;
    private int maxSwimValue = 0;

    public Cat(int runValue,int jumpValue,int swimValue) {
        super(runValue, jumpValue, swimValue);
    }

    public void run() {
        if (this.runValue > maxRunValue) {
            System.out.println("run: false");
        } else {
            System.out.println("run: true");
        }
    }
    public void jump() {
        if (this.jumpValue > maxJumpValue) {
            System.out.println("jump: false");
        } else {
            System.out.println("jump: true");
        }
    }
    public void swim() {
        if (swimValue > maxSwimValue) {
            System.out.println("swim: false");
        } else {
            System.out.println("swim: true");
        }
    }
}

class Dog extends Animal {
    private int maxRunValue = 500;
    private double maxJumpValue = 0.5;
    private int maxSwimValue = 10;

    public Dog(int runValue, int jumpValue,int swimValue) {
        super(runValue, jumpValue, swimValue);
    }

    public void run() {
        if (this.runValue > maxRunValue) {
            System.out.println("run: false");
        } else {
            System.out.println("run: true");
        }
    }
    public void jump() {
        if (jumpValue > maxJumpValue) {
            System.out.println("jump: false");
        } else {
            System.out.println("jump: true");
        }
    }
    public void swim() {
        if (swimValue > maxSwimValue) {
            System.out.println("swim: false");
        } else {
            System.out.println("swim: true");
        }
    }
}