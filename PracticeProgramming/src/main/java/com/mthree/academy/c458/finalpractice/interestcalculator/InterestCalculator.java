package com.mthree.academy.c458.finalpractice.interestcalculator;

import com.mthree.academy.c458.utils.UserInputUtils;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class InterestCalculator {
    public static void main(String[] args) {
        println("How much do you want to invest?");
        double principal = UserInputUtils.retrievePositiveDoubleInput();

        println("How many years are investing?");
        int yearsToInvest = UserInputUtils.retrievePositiveIntegerInput();

        println("What is the annual interest rate % growth?");
        double interestRate = UserInputUtils.retrievePositiveDoubleInput() / 100D;

        println("Calculating...");
        for(int i = 1; i <= yearsToInvest; i++) {
            println("\nYear " + i + ":");
            principal = calculateInterest(principal, interestRate);
        }
    }

    private static double calculateInterest(double initialPrincipal, double interestRate) {
        double interest = Math.round(Math.pow(initialPrincipal * interestRate, 4) * 100) / 100D;
        double newPrincipal = initialPrincipal + interest;
        println("Began with $" + initialPrincipal);
        println("Earned $" + interest);
        println("Ended with $" + (newPrincipal));
        return newPrincipal;
    }
}
