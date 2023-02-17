package com.hillel.shabrin.homeworks.homework4.animal;

public class Cat extends Animal{

    private static int catCount;
    private int runDistance;

    public Cat() {
        super();
        catCount++;
    }

    public Cat(String name) {
        this.name = name;
        runDistance = 200;
        catCount++;
    }

    public Cat(String name, int runDistance) {
        this.name = name;
        this.runDistance = runDistance;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= runDistance) {
            super.run(distance);
        } else
            System.out.println(this.name + " can't run so far");
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " can't swim");
    }
}
