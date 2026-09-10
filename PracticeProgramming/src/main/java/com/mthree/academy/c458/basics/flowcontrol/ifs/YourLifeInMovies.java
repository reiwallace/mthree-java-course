package com.mthree.academy.c458.basics.flowcontrol.ifs;

import com.mthree.academy.c458.utils.UserInputUtils;
import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        // Take user input
        System.out.println("Hey, let's play a game! What's your name?");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Ok, " + name + ", when were you born?");
        int year = UserInputUtils.retrieveIntegerInput();

        // Handle user input
        // Print header in the first if statement since all below it will run if this one runs
        if(year < 2005) {
            System.out.println("Well " + name + "...");
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        if(year < 1995) {
            System.out.println("The first Harry Potter came out over 15 years ago!");
        }
        if(year < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
        if(year < 1975) {
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if(year < 1965) {
            System.out.println("The MASH TV series has been around for almost half a century!");
        }
    }
}
