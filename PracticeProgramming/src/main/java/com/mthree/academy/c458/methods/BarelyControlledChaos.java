package com.mthree.academy.c458.methods;

import java.util.Random;

public class BarelyControlledChaos {
    private static final String[] ANIMALS = {"Sheep", "Dog", "Pig", "Cow", "Goat"};
    private static final String[] COLOURS = {"Blue", "Green", "Yellow", "Orange", "Purple"};
    private static final Random rng = new Random();

    public static void main(String[] args) {

        String color = getRandomColour(); // call color method here
        String animal = getRandomAnimal(); // call animal method again here
        String colorAgain = getRandomColour(); // call color method again here
        int weight = getRandomIntInRange(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = getRandomIntInRange(10, 20); // call number method,
        // with a range between 10 - 20
        int number = getRandomIntInRange(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = getRandomIntInRange(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    /**
     * Returns a random animal from the animal list
     * @return animal
     */
    private static String getRandomAnimal() {
        return ANIMALS[getRandomIntInRange(0, ANIMALS.length)];
    }

    /**
     * Returns a random colour from the colour list
     * @return colour
     */
    private static String getRandomColour() {
        return COLOURS[getRandomIntInRange(0, COLOURS.length)];
    }

    /**
     * Returns a random num in a range
     * @param min Minimum value to retrieve (inclusive)
     * @param max Maximum value to retrieve (inclusive)
     * @return random value
     */
    private static int getRandomIntInRange(int min, int max) { return rng.nextInt(max) + min; }

}