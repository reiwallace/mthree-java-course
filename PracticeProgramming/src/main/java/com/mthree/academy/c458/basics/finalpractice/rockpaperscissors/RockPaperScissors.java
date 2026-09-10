package com.mthree.academy.c458.basics.finalpractice.rockpaperscissors;

import com.mthree.academy.c458.utils.UserInputUtils;
import java.util.*;
import static com.mthree.academy.c458.utils.QuickOut.print;
import static com.mthree.academy.c458.utils.QuickOut.println;

public class RockPaperScissors {
    // Reaction constants
    private static final String[] REACTION_LINES = {
            "Yippee, a win!!",
            "A draw! At least it's not a loss!",
            "Dang, a loss! Maybe next round!"
    };

    // Game outcome constants - Maps to reaction lines
    private static final int WIN = 0;
    private static final int DRAW = 1;
    private static final int LOSS = 2;

    // Rock, paper, scissors constants with options array for mapping cpu choice
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String[] OPTIONS = {ROCK, PAPER, SCISSORS};
    private static final String TITLE = ROCK + ", " + PAPER + ", " + SCISSORS + " - REINA EDITION!";

    private static final Random RNG = new Random();

    // Class variables
    private int wins = 0;
    private int losses = 0;
    private int draws = 0;


    public static void main(String[] args) {
        // Set default values before the game
        UserInputUtils.setInputAttempts(3);
        boolean playGame = true;

        // Print title and start the game
        println(TITLE);
        println("");
        // Main game loop - While the player wishes to continue playing
        while(playGame) {
            int roundsToPlay = 1;
            // Prompt the player for how many rounds they wish to play
            println("How many rounds would you like to play?");
            roundsToPlay = UserInputUtils.retrieveIntegerInputInRange(1, 10);
            println("Alright! Let's play!");

            // Start a new game
            new RockPaperScissors(roundsToPlay);

            // Prompt the player on if they want to play again
            println("Would you like to play again? Y/N");
            String choice = UserInputUtils.retrieveNormalisedStringInput();
            if(choice.equals("n")) {
                playGame = false;
            }
        }

        // Final statement - Printed when the player chooses to end the game
        println("Thanks for playing " + TITLE);
        println("I look forward to seeing you again!");
    }

    private RockPaperScissors(int roundsToPlay) {
        // Run the game for the amount of rounds the user inputted.
        for(int currentRound = 1; currentRound <= roundsToPlay; currentRound++) {
            // State round then run game methods
            println("\nRound " + currentRound);
            int outcome = determineRoundOutcome(getNormalisedUserChoice());
            updateGameStats(outcome);
        }

        // Ends the game giving the user the final outcome and stats
        endGame();
    }

    /**
     * Determines the outcome of a round using rng
     * @param choice User's choice of rock paper or scissors
     * @return Integer outcome of the round - 0=win, 1=draw, 2=loss
     */
    private int determineRoundOutcome(String choice) {
        String cpuChoice = OPTIONS[RNG.nextInt(3)];

        // Outcome is loss by default -
        int outcome = LOSS;
        // Check if match is a draw
        if(choice.equals(cpuChoice)) {
            outcome = DRAW;
        }
        // Check win conditions
        else if(isPlayerWin(choice, cpuChoice)){
            outcome = WIN;
        }
        println("The computer chose: " + cpuChoice + ". ");
        println(REACTION_LINES[outcome]);
        return outcome;
    }

    /**
     * Checks all player and CPU choices for a player win
     * @param playerChoice Choice made the player
     * @param cpuChoice Choice made by the CPU
     * @return If the player wins the round
     */
    private boolean isPlayerWin(String playerChoice, String cpuChoice) {
        return (
                (playerChoice.equals(ROCK) && cpuChoice.equals(SCISSORS)) ||
                (playerChoice.equals(PAPER) && cpuChoice.equals(ROCK)) ||
                (playerChoice.equals(SCISSORS) && cpuChoice.equals(PAPER))
        );
    }

    /**
     * Updates the current game's stats from a round outcome.
     * @param outcome Integer outcome of the round - 0=win, 1=draw, 2=loss
     */
    private void updateGameStats(int outcome) {
        switch(outcome) {
            case WIN:
                wins++;
                break;
            case DRAW:
                draws++;
                break;
            case LOSS:
                losses++;
                break;
        }
    }

    /**
     * Ends the game giving the user the final outcome and stats.
     */
    private void endGame() {
        println("\nAnd that's game!");
        println("The results are in...");
        // Calculate if the player won or lost overall depending on their win-loss ratio
        if(wins > losses) {
            println("You won!! Hurray!!!");
        } else if(wins < losses) {
            println("You lost! There's always next time!");
        } else {
            println("Damn that was close! It's a draw!");
        }

        // Print stats afterwards - printing wins/draws/losses on the same line
        println("-- Game Stats --");
        print("Wins: " + wins);
        print("    Draws: " + draws);
        print("    Losses: " + losses + "\n");
    }

    /**
     * Gets a user choice from the hashmap of valid options
     * @return String choice made by the user
     */
    private String getNormalisedUserChoice() {
        println("Will you choose " + ROCK + ", " + PAPER + " or " + SCISSORS + "?");
        String line = UserInputUtils.retrieveNormalisedStringInput();

        // If input is not in valid choices map, reprompt the user.
        while(Arrays.stream(OPTIONS).noneMatch(line::equals)) {
            println(line + " is not a valid option. \nPlease enter either '" + ROCK + "', '" + PAPER + "' or '" + SCISSORS + "'.");
            line = UserInputUtils.retrieveNormalisedStringInput();
        }
        return line;
    }
}
