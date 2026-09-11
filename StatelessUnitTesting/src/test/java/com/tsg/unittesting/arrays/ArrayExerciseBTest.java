package com.tsg.unittesting.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExerciseBTest {

    @Test
    public void testMax32() {
        int[] ans = {5, 25, 160, 60, -5000000, 155};
        int[] nums = ArrayExerciseB.multiplyAll(5, new int[]{0, 5, 32, 12, -1000000, 31});
        for(int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], ans[i]);
        }
    }

    @Test
    public void testMaxNegative() {
        int[] ans = {-10, 0, -4, -24, -2000000, -500};
        int[] nums = ArrayExerciseB.multiplyAll(2, new int[]{-25, 0, -2, -24, -1000000, -250});
        for(int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], ans[i]);
        }
    }

    @Test
    public void testMax0() {
        int[] ans = {-10, 0, -4, -24, -2000000, -500};
        int[] nums = ArrayExerciseB.multiplyAll(2, new int[]{-25, 0, -2, -24, -1000000, -250});
        for(int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], ans[i]);
        }
    }

    @Test
    public void testMax1() {
        assertEquals(1, ArrayExerciseB.multiplyAll(new int[]{1}));
    }
}
