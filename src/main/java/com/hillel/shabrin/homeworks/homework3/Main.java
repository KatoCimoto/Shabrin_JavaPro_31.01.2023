package com.hillel.shabrin.homeworks.homework3;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        System.out.println("Work done!" + '\n');

        Employee employee = new Employee("John Doe", "Mechanic", "johndoe@yahoo.com",
                "23-444-21", 32);

        System.out.println(employee);
    }
}
