package com.hillel.shabrin.homeworks.homework6;

public class HomeWorkApp {
    public static void main(String[] args) {

    }

    // part 10
public static boolean isLeapYear(int year){
    if (year % 4 != 0) {
        return false;
    } else if (year % 100 != 0) {
        return true;
    } else if (year % 400 != 0) {
        return false;
    } else {
        return true;
    }
}

    // part 9
    public static void printSeveralTimes(String str, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    // part 8
    public static boolean isNegative(int a) {
        return a < 0;
    }

    // part 7
    public static void isPositive(int a) {
        if (a < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }

    // part 6
    public static boolean isTenToTwenty(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    // part 5
    public static void compareNumbers() {
        int a = 31;
        int b = 30;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // part 4
    public static void printColor() {
        int value = 15;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Blue");
        }
    }

    // part 3
    public static int checkSumSign() {
        int a = 5;
        int b = 10;

        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
        return sum;
    }

    // part 2
    public static void printThreeWords() {
        System.out.println("""
                Orange
                Apple
                Banana""");
    }
}

