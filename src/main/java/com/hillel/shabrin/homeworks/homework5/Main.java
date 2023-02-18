package com.hillel.shabrin.homeworks.homework5;
import com.hillel.shabrin.homeworks.homework5.figure.GetAreas;
import com.hillel.shabrin.homeworks.homework5.runGame.Start;

public class Main {
    public static void main(String[] args) {

        GetAreas getAreas = new GetAreas();
        getAreas.getAllAreas();

        Start start = new Start();
        start.start();

    }
}
