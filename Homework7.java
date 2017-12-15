/**
 *Java 1. Homework 7.
 *
 *@author Ivan Iov
 *@version dated Dec 15, 2017
 *@link https://github.com/mrPaulDure/Java1
 */

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Barsik", 20);
        catArray[1] = new Cat("Murchik", 30);
        catArray[2] = new Cat("Vasilij", 25);
        catArray[3] = new Cat("Pushok", 10);
        catArray[4] = new Cat("Wild Cat", 15);
        Plate plate = new Plate();
        for (int i = 0; i < catArray.length; i++) {
            System.out.println(catArray[i].getName());
            catArray[i].eat(plate);
        }
        plate.info();
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (appetite > p.getFood()) {
            fullness = false;
            System.out.println("Fullnes: " + fullness);
        } else {
            p.decreaseFood(appetite);
            fullness = true;
            System.out.println("Fullnes: " + fullness);
        }
    }
    public String getName() {
        return name;
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public Plate() {
        addFood();
    }

    public void decreaseFood(int n) {
            food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the plate!");
        int moreFood = sc.nextInt();
        food += moreFood;
    }
    public int getFood() {
        return food;
    }
}