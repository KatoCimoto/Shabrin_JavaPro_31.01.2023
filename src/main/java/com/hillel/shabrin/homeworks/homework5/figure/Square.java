package com.hillel.shabrin.homeworks.homework5.figure;

public class Square implements Figure{

    double side1;


    public Square(double side1, double side2, double side3, double side4) {
        this.side1 = side1;

    }

    @Override
    public double getFigureArea() {
        return side1 * 4;
    }
}
