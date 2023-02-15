package com.hillel.shabrin.homeworks.homework4;


import com.hillel.shabrin.homeworks.homework4.animal.Cat;
import com.hillel.shabrin.homeworks.homework4.animal.Dog;


public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruce");
        Dog dog2 = new Dog("Clark");
        Dog dog3 = new Dog("Ben");

        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Ramsey");
        Cat cat3 = new Cat("Soup");

        dog1.run(600);
        dog1.swim(7);
        System.out.println();

        dog2.run(345);
        dog2.swim(3);
        System.out.println();

        dog3.run(900);
        dog3.swim(11);
        System.out.println();

        cat1.run(199);
        cat1.swim();
        System.out.println();

        cat2.run(400);
        cat2.swim();
        System.out.println();

        cat3.run(15);
        cat3.swim();
        System.out.println();

        System.out.println("There were " + Dog.dogCount + " dogs and " + Cat.catCount + " cats in total.");
    }
}
