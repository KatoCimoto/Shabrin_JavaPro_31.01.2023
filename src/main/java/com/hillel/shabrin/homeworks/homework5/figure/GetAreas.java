package com.hillel.shabrin.homeworks.homework5.figure;

public class GetAreas {

    public void getAllAreas(){

        double allAreas = 0;
        Figure[] figures = new Figure[6];
        figures[0] = new Circle(7);
        figures[1] = new Circle(12);
        figures[2] = new Triangle(3,3,3);
        figures[3] = new Triangle(5,5,5);
        figures[4] = new Square(4,4,4,4);
        figures[5] = new Square(2,2,2,2);

        for (Figure figure : figures) {
            System.out.println("Area: " + figure.getFigureArea());
            allAreas += figure.getFigureArea();
        }

        System.out.println("Sum of all areas: " + allAreas);
    }
}
