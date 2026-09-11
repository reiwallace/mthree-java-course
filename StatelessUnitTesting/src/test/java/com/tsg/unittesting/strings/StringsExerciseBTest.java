package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsExerciseBTest {

    @Test
    public void testStringsHelloWorld() {
        assertEquals("hello world!HELLO WORLD!hello world!", StringsExerciseB.tripleIt("Hello World!"));
    }

    @Test
    public void testStringsAAA() {
        assertEquals("aaaaaaaaaaaaaaaAAAAAAAAAAAAAAAaaaaaaaaaaaaaaa", StringsExerciseB.tripleIt("aAaAAAAAAaaaaaa"));
    }

    @Test
    public void testStrings12() {
        assertEquals("121212", StringsExerciseB.tripleIt("12"));
    }

    @Test
    public void testStringsBlank() {
        assertEquals("", StringsExerciseB.tripleIt(""));
    }

    @Test
    public void testStringsMiscChars() {
        assertEquals("  aa    =1'#91   z  'b  ;;c\\\\\n''''&2a  AA    =1'#91   Z  'B  ;;C\\\\\n''''&2A  aa    =1'#91   z  'b  ;;c\\\\\n''''&2a", StringsExerciseB.tripleIt("  aa    =1'#91   z  'B  ;;C\\\\\n''''&2a"));
    }
}
