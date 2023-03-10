package com.hillel.shabrin.homeworks.homework8;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        ArraysValueCalculator arraysValueCalculator = new ArraysValueCalculator();
        try {
            int result = arraysValueCalculator.doCalc(array);
            System.out.println("Result: " + result);
        } catch (ArraySizeException ex) {
            System.out.println("Array size is not valid: " + ex.getMessage());
        } catch (ArrayDataException ex) {
            System.out.println("Array data is not valid: " + ex.getMessage());
        }
    }
}
