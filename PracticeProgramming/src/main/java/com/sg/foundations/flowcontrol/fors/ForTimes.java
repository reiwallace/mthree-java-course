package com.sg.foundations.flowcontrol.fors;

import static com.sg.foundations.utils.QuickOut.println;
import static com.sg.foundations.utils.UserInputUtils.retrieveIntegerInput;

public class ForTimes {
    public static void main(String[] args) {
        println("Which times tables should I recite?");
        int table = retrieveIntegerInput();

        for(int i = 1; i < 16; i++) {
            println(i + " * " + table + " is: " + i * table);
        }
    }
}
