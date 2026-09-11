package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsExerciseCTest {

    @Test
    public void testStringsHelloWorld() {
        assertEquals("Hll Wrld!", StringsExerciseC.removeTheVowels("Hello World!"));
    }

    @Test
    public void testStringsAAA() {
        assertEquals("", StringsExerciseC.removeTheVowels("aAaAAAAAAaaaaaa"));
    }

    @Test
    public void testStrings12() {
        assertEquals("12", StringsExerciseC.removeTheVowels("12"));
    }

    @Test
    public void testStringsBlank() {
        assertEquals("", StringsExerciseC.removeTheVowels(""));
    }

    @Test
    public void testStringsMiscChars() {
        assertEquals("      =1'#91   z  'B  ;;C\\\\\n''''&2", StringsExerciseC.removeTheVowels("  aa    =1'#91   z  'B  ;;C\\\\\n''''&2a"));
    }
}
