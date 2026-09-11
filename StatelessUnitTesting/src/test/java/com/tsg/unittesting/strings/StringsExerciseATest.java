package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsExerciseATest {

    @Test
    public void testStringsHelloWorld() {
        assertEquals("HELLO WORLD!", StringsExerciseA.yell("Hello World!"));
    }

    @Test
    public void testStringsAAA() {
        assertEquals("AAAAAAAAAAAAAAA", StringsExerciseA.yell("aAaAAAAAAaaaaaa"));
    }

    @Test
    public void testStrings12() {
        assertEquals("12", StringsExerciseA.yell("12"));
    }

    @Test
    public void testStringsBlank() {
        assertEquals("", StringsExerciseA.yell(""));
    }

    @Test
    public void testStringsMiscChars() {
        assertEquals("  AA    =1'#91   Z  'B  ;;C\\\\\n''''&2A", StringsExerciseA.yell("  aa    =1'#91   z  'B  ;;C\\\\\n''''&2a"));
    }
}
