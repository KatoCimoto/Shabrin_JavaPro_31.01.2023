package com.hillel.shabrin.homeworks.homework5.figure;

public class Circle implements Figure{

    double side1;

    public Circle(double side1) {
        this.side1 = side1;
    }

    @Override
    public double getFigureArea() {
        return side1;
    }
}
