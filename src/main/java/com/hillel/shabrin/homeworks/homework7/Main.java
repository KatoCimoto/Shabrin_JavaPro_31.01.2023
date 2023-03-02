package com.hillel.shabrin.homeworks.homework7;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //pt 6
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();

        String word = words[random.nextInt(words.length)];

        int attempts = 0;

        StringBuilder guess = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            guess.append("#");
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Guess the word: " + guess);

            System.out.print("Enter your guess (lowercase only): ");
            String answer = scanner.nextLine();

            if (answer.equals(word)) {
                System.out.println("Congratulations! You guessed the word in " + attempts + " attempts.");
                break;
            } else {
                attempts++;
                System.out.println("Wrong answer. Try again.");

                for (int i = 0; i < word.length(); i++) {
                    if (i < answer.length() && answer.charAt(i) == word.charAt(i)) {
                        guess.setCharAt(i, answer.charAt(i));
                    }
                }
            }
        }
        scanner.close();
    }


    //pt 5
    public static boolean isPalindrome(String str){

        StringBuilder builder = new StringBuilder(str);
       return builder.reverse().toString().equalsIgnoreCase(str);
    }

    //pt 4
    public static String stringReverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    //pt 3
    public static int findWordPosition(String source, String target){

        return source.indexOf(target);
    }


    // pt 2
    public static void findSymbolOccurance(String str, char ch){

        int count = 0;
        for (char c : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        System.out.println("The number of char '" + ch + "' in a string is " + count);
    }
}
