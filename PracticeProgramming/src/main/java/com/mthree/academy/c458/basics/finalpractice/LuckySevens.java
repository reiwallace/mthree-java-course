package com.mthree.academy.c458.basics.finalpractice;

import com.mthree.academy.c458.utils.UserInputUtils;

import java.util.Random;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class LuckySevens {
    private final Random rng = new Random();

    private int attempts = 0;
    private int balance = 0;
    private int highestBalance = 0;
    private int highestBalanceRound = 0;

    public static void main(String[] args) {
        // Prompts the user and takes their input
        println("How many dollars do you have?");
        int balance = UserInputUtils.retrievePositiveIntegerInput();

        // Starts a new game with the inputted balance
        new LuckySevens(balance);
    }

    public LuckySevens() {}

    /**
     * Sets the initial balance and starts the game
     * @param balance initial balance
     */
    public LuckySevens(int balance) {
        this.balance = balance;
        startGame();
    }

    /**
     * Starts the game
     */
    public void startGame() {
        highestBalance = balance;
        highestBalanceRound = attempts;
        while(balance > 0) {
            playRound();
        }
        endGame();
    }

    /**
     * Sets the current game balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * Prints end of game text
     */
    private void endGame() {
        println("You are broke after " + attempts + " rolls.");
        println("You should have quit after " + highestBalanceRound + " rolls when you had $" + highestBalance + ".");
    }

    /**
     * Increments attempts, Rolls 2 dice and checks win conditions
     */
    private void playRound() {
        attempts += 1;
        int result = rng.nextInt(5) + rng.nextInt(5) + 2;

        if(result == 7) {
            winRound();
        } else {
            loseRound();
        }
    }

    /**
     * Wins a round, increasing balance by 4 and setting the highest balance if valid
     */
    private void winRound() {
        balance += 4;
        if(balance > highestBalance) {
            highestBalance = balance;
            highestBalanceRound = attempts;
        }
    }

    /**
     * Loses a round, decrementing balance
     */
    private void loseRound() {
        balance -= 1;
    }
}
