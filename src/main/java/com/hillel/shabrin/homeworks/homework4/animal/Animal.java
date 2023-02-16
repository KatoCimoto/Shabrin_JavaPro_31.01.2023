package com.hillel.shabrin.homeworks.homework4.animal;

public abstract class Animal {

    String name;
    private static int anCount;

    public Animal() {
        anCount++;
    }

    public Animal(String name) {
        this.name = name;
        anCount++;
    }

    public static int getAnCount() {
        return anCount;
    }

    public void run(int howLong){
        System.out.println(name + " running " + howLong + 'm');
    }
    public void swim(int howLong){
        System.out.println(name + " swimming " + howLong + 'm');
    }

}
