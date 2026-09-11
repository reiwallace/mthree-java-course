/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.strings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahill
 */
public class StringsExerciseC {

    /**
     * Take a word, and remove all its vowels and returns it.
     *
     * Ex:
     * removeTheVowels( "truncate" ) ->  "trnct"
     * removeTheVowels( "squashed" ) ->  "sqshd"
     * removeTheVowels( "compressed" ) ->  "cmprssd"
     * @param word
     * @return String
     */
    public static String removeTheVowels(String word){
        StringBuilder builder = new StringBuilder(word);
        int pointer = 0;
        while(pointer < builder.length()) {
            char cur = builder.charAt(pointer);
            if(cur == 'a' || cur == 'A' || cur == 'e' || cur == 'E' || cur == 'i' || cur == 'I' || cur == 'o' || cur == 'O' || cur == 'u' || cur == 'U') {
                builder.delete(pointer, pointer + 1);
            } else {
                pointer++;
            }
        }
        return builder.toString();
    }
    
}
