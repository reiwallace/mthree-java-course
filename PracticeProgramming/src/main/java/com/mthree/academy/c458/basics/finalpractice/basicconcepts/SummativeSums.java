package com.mthree.academy.c458.basics.finalpractice.basicconcepts;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class SummativeSums {
    // 2D Array of examples so they can be iterated through in the main method
    private static final int[][] EXAMPLES = {
            { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
            { 999, -60, -77, 14, 160, 301 },
            { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }
    };

    public static void main(String[] args) {
        // Cycle through all examples and print the result
        for(int i = 1; i <= EXAMPLES.length; i++) {
            println("#" + i + " Array Sum: " + arraySum(EXAMPLES[i - 1]));
        }
    }

    /**
     * Takes an integer array and calculates the total value of all integers in the array
     * @param nums Integer array of non-null integers
     * @return Total of all integers in the array
     */
    private static int arraySum(int[] nums) {
        int total = 0;
        for(int num : nums) {
            total += num;
        }
        return total;
    }
}
