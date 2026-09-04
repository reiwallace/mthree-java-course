package com.mthree.academy.c458.utils;

import java.util.Scanner;

public class UserInputUtils {
    private static final int MAX_INPUT_ATTEMPTS = 3;

    /**
     * Attempts to retrieve and parse integer input from System.In
     * @return User inputted value
     */
    public static int retrieveIntegerInput() {
        Scanner input = new Scanner(System.in);
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= MAX_INPUT_ATTEMPTS; i++) {
            inputVal = input.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                int val = Integer.parseInt(inputVal);
                if(val < 0) {
                    System.out.println("Negative values not accepted. Please try again.");
                    System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1, -5, 2000). Please try again.");
                System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        throw new RuntimeException();
    }

    /**
     * Attempts to retrieve and parse Double input from System.In
     * @return User inputted value
     */
    public static double retrieveDoubleInput() {
        Scanner input = new Scanner(System.in);
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= MAX_INPUT_ATTEMPTS; i++) {
            inputVal = input.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                double val = Double.parseDouble(inputVal);
                if(val < 0) {
                    System.out.println("Negative values not accepted. Please try again.");
                    System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1.25, 2000.01). Please try again.");
                System.out.println("Attempts remaining: " + (MAX_INPUT_ATTEMPTS - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        throw new RuntimeException();
    }
}
