package com.mthree.academy.c458.finalpractice.basicconcepts;

import com.mthree.academy.c458.utils.UserInputUtils;
import java.util.Random;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class DogGenetics {
    private static final String[] BREEDS = {
            "St. Bernard",
            "Chihuahua",
            "Dramatic RedNosed Asian Pug",
            "Common Cur",
            "King Doberman"
    };
    private static final Random rng = new Random();

    public static void main(String[] args) {
        println("What is your dogs name?");
        String name = UserInputUtils.retrieveStringInput();
        println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n");
        println(name + " is:\n");

        int percentLeft = 100;
        for (int i = 0; i < BREEDS.length - 1; i++) {
            int percentOfBreed = rng.nextInt(percentLeft);
            println(percentOfBreed + "% " + BREEDS[i]);
            percentLeft -= percentOfBreed;
        }

        println(percentLeft + "% " + BREEDS[BREEDS.length - 1]);

        println("\nWow, that's QUITE the dog!");
    }
}
