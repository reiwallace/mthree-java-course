package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsExerciseFTest {

    @Test
    public void testStringsHelloWorld() {
        assertEquals("World!", StringsExerciseF.longestWord("Hello World!"));
    }

    @Test
    public void testStringsAAA() {
        assertEquals("aAaAAAAAAaaaaaa", StringsExerciseF.longestWord("aAaAAAAAAaaaaaa"));
    }

    @Test
    public void testStrings12() {
        assertEquals("12", StringsExerciseF.longestWord("12"));
    }

    @Test
    public void testStringsBlank() {
        assertEquals("", StringsExerciseF.longestWord(""));
    }

    @Test
    public void testStringsMiscChars() {
        assertEquals(";;C\\\\\n''''&2a", StringsExerciseF.longestWord("  aa    =1'#91   z  'B  ;;C\\\\\n''''&2a"));
    }
}
