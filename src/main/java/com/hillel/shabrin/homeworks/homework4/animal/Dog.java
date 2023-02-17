package com.hillel.shabrin.homeworks.homework4.animal;

public class Dog extends Animal{

    private static int dogCount;

    private int runDistance;
    private int swimDistance;

    public Dog() {
        super();
        dogCount++;
    }

    public Dog(String name) {
        this.name = name;
        runDistance = 500;
        swimDistance = 10;
        dogCount++;
    }

    public Dog(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }


    @Override
    public void run(int distance) {
        if (distance <= runDistance) {
            super.run(distance);
        } else
            System.out.println(name + " can't run so far");
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimDistance) {
            super.swim(distance);
        } else
            System.out.println(name + " can't swim so far");
    }
}
