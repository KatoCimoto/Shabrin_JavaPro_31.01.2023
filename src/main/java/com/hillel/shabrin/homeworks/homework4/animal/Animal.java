package com.hillel.shabrin.homeworks.homework4.animal;

public abstract class Animal {

    String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public void run(int howLong){
        System.out.println(name + " running " + howLong + 'm');
    }
    public void swim(int howLong){
        System.out.println(name + " swimming " + howLong + 'm');
    }

}
