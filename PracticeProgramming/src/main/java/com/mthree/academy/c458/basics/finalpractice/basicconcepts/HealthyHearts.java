package com.mthree.academy.c458.basics.finalpractice.basicconcepts;

import com.mthree.academy.c458.utils.UserInputUtils;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class HealthyHearts {
    public static void main(String[] args) {
        // Prompt user and save age
        println("What is your age?");
        int age = UserInputUtils.retrievePositiveIntegerInput();

        // Calculate heart rate stats
        int maxHeartRate = calculateMaxHeartRate(age);
        long[] range = calculateTargetHeartRate(maxHeartRate);

        // Output result
        println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        println("Your target HR Zone is " + range[0] + " - " + range[1] + " beats per minute");
    }

    /**
     * Calculates the maximum heart rate for an individual of a given age
     * @param age User's age
     * @return Maximum heart rate
     */
    private static int calculateMaxHeartRate(int age) {
        return 220 - age;
    }

    /**
     * Calculates the target heart rate range based on an individual's max heart rate
     * @param maxHeartRate Maximum heart rate for the user
     * @return Int array with index 0 being the lower bound of the heart rate range and index 1 being the upper bound.
     */
    private static long[] calculateTargetHeartRate(int maxHeartRate) {
        return new long[]{Math.round(maxHeartRate * 0.5), Math.round(maxHeartRate * 0.85)};
    }
}
