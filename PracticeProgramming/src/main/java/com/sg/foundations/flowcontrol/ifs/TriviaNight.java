package com.sg.foundations.flowcontrol.ifs;

import com.sg.foundations.utils.utils.UserInputUtils;
import static com.sg.foundations.utils.utils.QuickOut.println;

public class TriviaNight {
    public static void main(String[] args) {
        println("It's TRIVIA NIGHT! Are you ready?!");

        // Define int to count correct answers
        int correct = 0;

        // Questions 1-3
        // Print question then take answer
        // Add output of answer to the total
        println(
                "FIRST QUESTION!\n" +
                "What is the Lowest Level Programming Language?\n" +
                "1) Source Code\t\t2) Assembly Language\n" +
                "3) C#\t\t\t\t4) Machine Code"
        );
        println("YOUR ANSWER:");
        correct += UserInputUtils.retrieveIntegerInput() == 4 ? 1 : 0;

        println(
                "SECOND QUESTION!\n" +
                "Website Security CAPTCHA Forms Are Descended From the Work of?\n" +
                "1) Grace Hopper\t\t2) Alan Turing\n" +
                "3) Charles Babbage\t\t4) Larry Page"
        );
        println("YOUR ANSWER:");
        correct += UserInputUtils.retrieveIntegerInput() == 2 ? 1 : 0;

        println(
                "LAST QUESTION!\n" +
                "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n" +
                "1) Serenity\t\t\t2) The Battlestar Galactica\n" +
                "3) The USS Enterprise\t4) The Millennium Falcon"
        );
        println("YOUR ANSWER:");
        correct += UserInputUtils.retrieveIntegerInput() == 3 ? 1 : 0;

        // Give user feedback
        println("Nice job! - You got " + correct + " correct!");
    }
}
