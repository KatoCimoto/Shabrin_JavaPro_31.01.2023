package com.hillel.shabrin.homeworks.homework4.animal;

public class Animal {

    String name;
    private static int anCount;


    int distance;
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

    public void run(int distance){
        System.out.println(this.name + " running " + distance + 'm');
    }
    public void swim(int distance){
    System.out.println(this.name + " swimming " + distance + 'm');
    }

}
