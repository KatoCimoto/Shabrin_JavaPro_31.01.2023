package com.hillel.shabrin.homeworks.homework4.animal;

public class Cat extends Animal{

    private static int catCount;

    private int maxDistanceToRun;
    
    
    public Cat() {
        super();
        maxDistanceToRun = 200;
        catCount++;
    }

    public Cat(String name) {
        this.name = name;
        maxDistanceToRun = 200;
        catCount++;
    }
    
    public Cat(String name, int maxDistanceToRun) {
        this.name = name;
        this.maxDistanceToRun = maxDistanceToRun;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int howLong) {
        if (howLong <= maxDistanceToRun) {
            super.run(howLong);
        } else
            System.out.println(name + " can't run so far");
    }

    @Override
    public void swim(int howLong) {
        System.out.println(name + " can't swim");
    }
}
