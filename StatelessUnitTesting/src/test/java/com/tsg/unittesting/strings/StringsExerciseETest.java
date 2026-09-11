package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringsExerciseETest {

    @Test
    public void testStringsHelloWorld() {
        assertTrue(StringsExerciseE.containsTheOther("Hello World!", "ello"));
    }

    @Test
    public void testStringsAAA() {
        assertTrue(StringsExerciseE.containsTheOther("aAaAAAAAAaaaaaa", "AaAAAAAAaaaaaa"));
    }

    @Test
    public void testStrings12() {

        assertTrue(StringsExerciseE.containsTheOther("12", "1"));
    }

    @Test
    public void testStringsBlank() {
        assertFalse(StringsExerciseE.containsTheOther("", " "));
    }

    @Test
    public void testStringsMiscChars() {
        assertTrue(StringsExerciseE.containsTheOther("  aa    =1'#91   z  'B  ;;C\\\\\n''''&2a", "\n''"));
    }
}
