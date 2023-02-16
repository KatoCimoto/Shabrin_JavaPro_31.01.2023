package com.hillel.shabrin.homeworks.homework4.animal;

public class Cat extends Animal{

    private static int catCount;

    public Cat() {
        super();
        catCount++;
    }

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int howLong) {
        if (howLong <= 200) {
            super.run(howLong);
        } else
            System.out.println(name + " can't run so far");
    }

    @Override
    public void swim(int howLong) {
        System.out.println(name + " can't swim");
    }
}
