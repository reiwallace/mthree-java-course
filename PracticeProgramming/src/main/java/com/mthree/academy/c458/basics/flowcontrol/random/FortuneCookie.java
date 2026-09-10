package com.mthree.academy.c458.basics.flowcontrol.random;

import java.util.Random;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class FortuneCookie {
    private static final String[] QUOTES = {
        "Try not. Do, or do not. There is no try.",
        "Those aren't the droids you're looking for.",
        "It is not a bug; it is an undocumented feature.",
        "Your code will compile on the first try... in a parallel universe."
    };

    public static void main(String[] args) {
        Random rng = new Random();
        println("Your Geek Fortune: " + QUOTES[rng.nextInt(QUOTES.length)]);
    }
}
