package com.mthree.academy.c458.utils;

import java.util.Scanner;

public class UserInputUtils {
    private static int maxInputAttempts = 3;
    private static final Scanner INPUT = new Scanner(System.in);

    /**
     * Attempts to retrieve and parse integer input from System.In
     * @return User inputted value
     */
    public static int retrieveIntegerInput() {
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= maxInputAttempts; i++) {
            inputVal = INPUT.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                int val = Integer.parseInt(inputVal);
                if(val < 0) {
                    System.out.println("Negative values not accepted. Please try again.");
                    System.out.println("Attempts remaining: " + (maxInputAttempts - i));
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1, -5, 2000). Please try again.");
                System.out.println("Attempts remaining: " + (maxInputAttempts - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        System.exit(1);
        return 1;
    }

    /**
     * Attempts to retrieve and parse integer input from System, within a specified range
     * (INCLUDES MIN AND MAX)
     * @param min Minimum value to retrieve (inclusive)
     * @param max Maximum value to retrieve (inclusive)
     * @return User inputted value
     */
    public static int retrieveIntegerInputInRange(int min, int max) {
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= maxInputAttempts; i++) {
            inputVal = INPUT.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                int val = Integer.parseInt(inputVal);
                // Reject values outside the range
                if(val < min || val > max) {
                    System.out.println("Value must be between " + min + " and " + max + ". Please try again.");
                    System.out.println("Attempts remaining: " + (maxInputAttempts - i));
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1, -5, 2000). Please try again.");
                System.out.println("Attempts remaining: " + (maxInputAttempts - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        System.exit(1);
        return 1;
    }

    /**
     * Attempts to retrieve and parse Double input from System.In
     * @return User inputted value
     */
    public static double retrieveDoubleInput() {
        String inputVal;

        // Loop up to set number of attempts before returning 0
        for(int i = 1; i <= maxInputAttempts; i++) {
            inputVal = INPUT.nextLine();
            // Attempt to parse the value - Inform user if fail
            try {
                double val = Double.parseDouble(inputVal);
                if(val < 0) {
                    System.out.println("Negative values not accepted. Please try again.");
                    System.out.println("Attempts remaining: " + (maxInputAttempts - i));
                } else {
                    return val;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. 0, 1.25, 2000.01). Please try again.");
                System.out.println("Attempts remaining: " + (maxInputAttempts - i));
            }
        }
        System.out.println("Max attempts exceeded.");
        System.exit(1);
        return 1;
    }

    /**
     * Allows access to the scanner without making it public
     * Waits for user input then returns string line
     * @return User string input
     */
    public static String retrieveStringInput() {
        return INPUT.nextLine();
    }

    /**
     * Returns a normalised version of user input
     * @return Stripped and lowercase user input
     */
    public static String retrieveNormalisedStringInput() {
        return retrieveStringInput().strip().toLowerCase();
    }

    /**
     * Sets global max input attempts
     * @param amount max attempts
     */
    public static void setInputAttempts(int amount) { maxInputAttempts = amount; }
}
