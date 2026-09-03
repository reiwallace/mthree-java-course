package com.sg.foundations.flowcontrol.ifs;

import com.sg.foundations.flowcontrol.utils.UserInputUtils;

public class GuessMe {
    private static final int NUM = 44;

    public static void main(String[] args) {
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");

        // Handler user input
        int input = UserInputUtils.retrieveIntegerInput();
        if(input == NUM) {
            System.out.println("Wow, nice guess! That was it!");
        } else if(input < NUM) {
            System.out.println("Ha, nice try - too low! I chose " + NUM + ".");
        } else {
            System.out.println("Too bad, way too high. I chose " + NUM + ".");
        }
    }
}
