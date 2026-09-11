package com.tsg.unittesting.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExerciseATest {

    @Test
    public void testMax32() {
        assertEquals(32, ArrayExerciseA.maxOfArray(new int[]{0, 5, 32, 12, -1000000, 31}));
    }

    @Test
    public void testMaxNegative() {
        assertEquals(-10, ArrayExerciseA.maxOfArray(new int[]{-1000, -52, -11, -10, -1000000, -12}));
    }

    @Test
    public void testMax0() {
        assertEquals(0, ArrayExerciseA.maxOfArray(new int[]{0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void testMax1() {
        assertEquals(1, ArrayExerciseA.maxOfArray(new int[]{1}));
    }
}
