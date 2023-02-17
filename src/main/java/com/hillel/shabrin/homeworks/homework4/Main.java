package com.hillel.shabrin.homeworks.homework4;


import com.hillel.shabrin.homeworks.homework4.animal.Animal;
import com.hillel.shabrin.homeworks.homework4.animal.Cat;
import com.hillel.shabrin.homeworks.homework4.animal.Dog;


public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruce",500,10);
        Dog dog2 = new Dog("Clark",500,10);
        Dog dog3 = new Dog("Ben",500,10);

        Cat cat1 = new Cat("Tom", 300);
        Cat cat2 = new Cat("Ramsey",150);
        Cat cat3 = new Cat("Soup",100);

        dog1.run(400);
        dog1.swim(7);
        System.out.println();

        dog2.run(345);
        dog2.swim(3);
        System.out.println();

        dog3.run(900);
        dog3.swim(10);
        System.out.println();

        cat1.run(199);
        cat1.swim(4);
        System.out.println();

        cat2.run(400);
        cat2.swim(2);
        System.out.println();

        cat3.run(15);
        cat3.swim(8);
        System.out.println();

         System.out.println("There were " + Dog.getDogCount() + " dogs and " + Cat.getCatCount() + " cats.");
        System.out.println("The total number of animals: " + Animal.getAnCount());
    }
}
