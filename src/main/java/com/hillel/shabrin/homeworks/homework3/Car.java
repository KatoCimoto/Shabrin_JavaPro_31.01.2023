package com.hillel.shabrin.homeworks.homework3;

public class Car {
    public void start(){
        startCommand();
        startElectricity();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("Electricity started!");
    }
    private void startCommand(){
        System.out.println("Starting..");
    }
    private void startFuelSystem(){
        System.out.println("Fuel system started!");
    }
}
