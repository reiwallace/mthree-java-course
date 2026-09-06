package com.mthree.academy.c458.utils;

import java.util.Scanner;

public class UserInputUtils {
    private static int maxInputAttempts = 3;
    private static final Scanner INPUT = new Scanner(System.in);
    
    private static int currentRemainingAttempts = maxInputAttempts;

    /**
     * Attempts to retrieve and parse integer input from System.In
     * @param format format to print upon invalid input
     * @return valid integer
     */
    private static int tryRetrieveInt(String format) {
        while(currentRemainingAttempts > 0) {
            try {
                return Integer.parseInt(INPUT.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. " + format + "). Please try again.");
                decrementAttempts();
            }
        }
        return exceedMaxAttempts();
    }

    /**
     * Attempts to retrieve and parse integer input from System.In
     * @return User inputted integer
     */
    public static int retrieveIntegerInput() {
        resetInputAttempts();
        return tryRetrieveInt("0, 1, -5, 2000");
    }

    /**
     * Attempts to retrieve integer input from System, within a specified range
     * (INCLUDES MIN AND MAX)
     * @param min Minimum value to retrieve (inclusive)
     * @param max Maximum value to retrieve (inclusive)
     * @return User inputted value
     */
    public static int retrieveIntegerInputInRange(int min, int max) {
        resetInputAttempts();
        while(currentRemainingAttempts > 0) {
            int num = tryRetrieveInt("0, 1, -5, 2000");
            if(num < min || num > max) {
                System.out.println("Value must be between " + min + " and " + max + ". Please try again.");
                decrementAttempts();
            } else {
                return num;
            }
        }
        return exceedMaxAttempts();
    }

    /**
     * Attempts to retrieve an integer input from System, only accepting positive values
     * @return User inputted value
     */
    public static int retrievePositiveIntegerInput() {
        resetInputAttempts();
        while(currentRemainingAttempts > 0) {
            int num = tryRetrieveInt("0, 1, 2000");
            if(num < 0) {
                System.out.println("Negative values not allowed. Please try again.");
                decrementAttempts();
            } else {
                return num;
            }
        }
        return exceedMaxAttempts();
    }

    /**
     * Attempts to parse double from input value, decrementing attempts
     * @param format format to print upon invalid number
     * @return valid Double
     */
    private static double tryRetrieveDouble(String format) {
        while(currentRemainingAttempts > 0) {
            try {
                return Double.parseDouble(INPUT.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format (e.g. " + format + "). Please try again.");
                decrementAttempts();
            }
        }
        return exceedMaxAttempts();
    }

    /**
     * Attempts to retrieve and parse Double input from System.In
     * @return User inputted value
     */
    public static double retrieveDoubleInput() {
        resetInputAttempts();
        return tryRetrieveDouble("0, 1.25, 2000.01, -50.0");
    }

    /**
     * Attempts to retrieve and parse Double input from System.In
     * @return User inputted value
     */
    public static double retrievePositiveDoubleInput() {
        resetInputAttempts();
        while(currentRemainingAttempts > 0) {
            double num = tryRetrieveDouble("0, 1, 2000");
            if(num < 0) {
                System.out.println("Negative values not allowed. Please try again.");
                decrementAttempts();
            } else {
                return num;
            }
        }
        return exceedMaxAttempts();
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

    /**
     * Resets current input attempts to max input attempts
     */
    private static void resetInputAttempts() {
        currentRemainingAttempts = maxInputAttempts;
    }

    /**
     * Decrements input attempts and outputs this to the user
     */
    private static void decrementAttempts() {
        currentRemainingAttempts -= 1;
        System.out.println("Attempts remaining: " + currentRemainingAttempts);
    }

    /**
     * Outputs that the max attempts have been reached and exits the program
     * @return exit code
     */
    private static int exceedMaxAttempts() {
        System.out.println("Max attempts exceeded.");
        System.exit(1);
        return 1;
    }
}
