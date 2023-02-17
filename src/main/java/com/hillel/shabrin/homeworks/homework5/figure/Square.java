package com.hillel.shabrin.homeworks.homework5.figure;

public class Square implements Figure{

    double side1;
    double side2;
    double side3;
    double side4;

    public Square(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public double getFigureArea() {
        return side1 * side2 * side3 * side4;
    }
}
