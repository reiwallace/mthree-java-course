/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.strings;

/**
 *
 * @author ahill
 */
public class StringsExerciseF {
    
    /**
     * Take in a phrase that has many words separated by spaces. 
     * Return the longest word that you can find within the phrase - 
     * don't forget, hyphenated words are allowed!
     *
     * If there is a tie, return the first instance of a word of that size.
     *
     * Ex:
     * longestWord( "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation and 2% butterscotch ripple" ) ->  "perspiration"
     * longestWord( "All well-established principles should be periodically challenged" ) ->  "well-established"
     * longestWord( "Never argue with the data" ) ->  "Never"
     * 
     * @param aPhrase
     * @return String word
     */
    public static String longestWord(String aPhrase){
        String[] split = aPhrase.split(" ");
        int biggestIdx = 0;
        int biggestSize = 0;
        for(int i = 0; i < split.length; i++) {
            if(split[i].length() > biggestSize) {
                biggestIdx = i;
                biggestSize = split[i].length();
            }
        }
        return split[biggestIdx];
    }
}
