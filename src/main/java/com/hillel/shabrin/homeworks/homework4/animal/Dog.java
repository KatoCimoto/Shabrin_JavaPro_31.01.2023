package com.hillel.shabrin.homeworks.homework4.animal;

public class Dog extends Animal{

    public static int dogCount;

    public Dog() {
        super();
        dogCount++;
    }

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int howLong) {
        if (howLong <= 500) {
            super.run(howLong);
        } else
            System.out.println(name + " can't run so far");
    }

    @Override
    public void swim(int howLong) {
        if (howLong <= 10) {
            super.swim(howLong);
        } else
            System.out.println(name + " can't swim so far");
    }
}
