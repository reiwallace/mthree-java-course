package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsExerciseDTest {

    @Test
    public void testStringsHelloWorld() {
        assertEquals("!dlroW olleH", StringsExerciseD.simpleReverse("Hello World!"));
    }

    @Test
    public void testStringsAAA() {
        assertEquals("aaaaaaAAAAAAaAa", StringsExerciseD.simpleReverse("aAaAAAAAAaaaaaa"));
    }

    @Test
    public void testStrings12() {
        assertEquals("21", StringsExerciseD.simpleReverse("12"));
    }

    @Test
    public void testStringsBlank() {
        assertEquals("", StringsExerciseD.simpleReverse(""));
    }

    @Test
    public void testStringsMiscChars() {
        assertEquals("a2&''''\n\\\\C;;  B'  z   19#'1=    aa  ", StringsExerciseD.simpleReverse("  aa    =1'#91   z  'B  ;;C\\\\\n''''&2a"));
    }
}
