package com.hillel.shabrin.homeworks.homework8;

import static com.hillel.shabrin.homeworks.homework8.ArraysValueCalculator.doCalc;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(array);
            System.out.println(result);
        } catch (ArraysValueCalculator.ArraySizeException ex) {
            System.err.println("Array size should be 4x4");
        } catch (ArraysValueCalculator.ArrayDataException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Invalid data in array");
        }
    }
}