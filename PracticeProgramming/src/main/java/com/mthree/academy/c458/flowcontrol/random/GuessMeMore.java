package com.mthree.academy.c458.flowcontrol.random;

import com.mthree.academy.c458.utils.UserInputUtils;

import java.util.Random;

public class GuessMeMore {
    public static void main(String[] args) {
        int num = new Random().nextInt(201) - 100;
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.println("Your guess: ");

        // Handler user input
        int input = UserInputUtils.retrieveIntegerInput();
        if(input == num) {
            System.out.println("Wow, nice guess! That was it!");
        } else if(input < num) {
            System.out.println("Ha, nice try - too low! I chose " + num + ".");
        } else {
            System.out.println("Too bad, way too high. I chose " + num + ".");
        }
    }
}
