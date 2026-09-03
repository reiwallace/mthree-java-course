package com.sg.foundations.flowcontrol.fors;

import static com.sg.foundations.utils.QuickOut.println;
import static com.sg.foundations.utils.UserInputUtils.retrieveIntegerInput;

public class FizzBuzz {
    public static void main(String[] args) {
        // Prompt the user
        println("How many units of fizzing and buzzing do you need in your life?");
        int maxFizzBuzz = retrieveIntegerInput();

        // Initialise loop variables
        int fizzBuzzes = 0;
        int i = 0;

        // While the amount of fizz buzzes so far is less than the required fizz buzzes
        while(fizzBuzzes < maxFizzBuzz) {
            // Check if number is a fizz or a buzz
            boolean fizz = isFizz(i);
            boolean buzz = isBuzz(i);
            if(fizz && buzz) {
                println("fizz buzz");
                fizzBuzzes += 2;
            } else if(fizz || buzz) {
                println(fizz ? "fizz" : "buzz");
                fizzBuzzes += 1;
            } else {
                println(String.valueOf(i));
            }
            i++;
        }

        // Final statement
        println("TRADITION!!!!!");
    }

    /**
     * Calculates if a number is a fizz
     * @param num number to check
     * @return if the number remainder 3 is 0 and is not equal to 0
     */
    private static boolean isFizz(int num) {
        return num % 3 == 0 && num != 0;
    }

    /**
     * Calculates if a number is a buzz
     * @param num number to check
     * @return if the number remainder 5 is 0 and is not equal to 0
     */
    private static boolean isBuzz(int num) {
        return num % 5 == 0 && num != 0;
    }
}
