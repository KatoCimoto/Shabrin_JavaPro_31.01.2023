package com.hillel.shabrin.homeworks.homework7;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //pt 6
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado" , "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive",
                " pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! You need to guess one word that I thought of.");
        System.out.println("This word refers to the theme of vegetables and fruits.");

        Random random = new Random();

        String answer = words[random.nextInt(words.length)];
        char[] answerChars = answer.toCharArray();
        char[] guessChars = new char[answerChars.length];
        Arrays.fill(guessChars, '#');

        boolean guessed = false;
        while (!guessed) {
            System.out.print("Guess the word: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals(answer)) {
                guessed = true;
            } else {
                for (int i = 0; i < guessChars.length; i++) {
                    if (i < guess.length() && guess.charAt(i) == answerChars[i]) {
                        guessChars[i] = answerChars[i];
                    }
                }
                System.out.println(guessChars);
            }
        }
        System.out.println("Congratulations! You guessed the word: " + answer);
    }

    //pt 5
    public static boolean isPalindrome(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        String strInverted = strBuilder.toString();

        return str.equalsIgnoreCase(strInverted);
    }

    //pt 4
    public static String stringReverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    //pt 3
    public static int findWordPosition(String source, String target){
        int position = source.indexOf(target);
        if (position == -1) {
            return -1;
        } else {
            return position;
        }
    }


    // pt 2
    public static void findSymbolOccurance(String str, char ch){

        int count = 0;
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if(ch == strArray[i]){
                count++;
            }
        }
        System.out.println("The number of char \"" + ch + "\" in a string is " + count);

    }
}
