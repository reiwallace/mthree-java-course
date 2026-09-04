package com.mthree.academy.c458.flowcontrol.whilesdos;


import com.mthree.academy.c458.utils.UserInputUtils;

import static com.mthree.academy.c458.utils.QuickOut.print;
import static com.mthree.academy.c458.utils.QuickOut.println;

public class StayPositive {
    public static void main(String[] args) {
        // Prompt user and take input
        println("What number should I count down from?");
        int start = UserInputUtils.retrieveIntegerInput();
        // Initialise variable to count numbers on the current line
        int numsOnLine = 1;

        println("Counting down...");
        while (start >= 0) {
            // Before we reach 10 numbers on a line print the numbers on the same line
            if(numsOnLine < 10) {
                print(start-- + " ");
                numsOnLine++;
            }
            // Start a new line upon reaching 10
            else {
                println(start-- + " ");
                numsOnLine = 1;
            }
        }
    }
}
