package com.mthree.academy.c458.finalpractice.interestcalculator;

import com.mthree.academy.c458.utils.UserInputUtils;
import static com.mthree.academy.c458.utils.QuickOut.println;

public class InterestCalculator {
    private static final int DAILY = 1;
    private static final int MONTHLY = 2;
    private static final int QUARTERLY = 3;

    public static void main(String[] args) {
        println("How much do you want to invest?");
        double principal = UserInputUtils.retrievePositiveDoubleInput();

        println("How many years are investing?");
        int yearsToInvest = UserInputUtils.retrievePositiveIntegerInput();

        println("What is the annual interest rate % growth?");
        double interestRate = UserInputUtils.retrievePositiveDoubleInput() / 100D;

        println("What is your compound period?");
        println("1) Daily    2) Monthly    3) Quarterly");
        int compoundType = UserInputUtils.retrieveIntegerInputInRange(1, 3);

        println("Calculating...");
        for(int i = 1; i <= yearsToInvest; i++) {
            println("\nYear " + i + ":");
            principal = calculateInterest(principal, interestRate, compoundType);
        }
    }

    private static double calculateInterest(double initialPrincipal, double interestRate, int compoundType) {
        double interest = 0;
        int compoundRate = 1;
        switch(compoundType) {
            case DAILY:
                compoundRate = 365;
                break;

            case MONTHLY:
                compoundRate = 12;
                break;

            case QUARTERLY:
                compoundRate = 4;
                break;
        }

        double interestPer = interestRate / compoundRate;
        for(int i = 0; i < compoundRate; i++) {
            interest += (initialPrincipal + interest) * interestPer;
        }
        double newPrincipal = initialPrincipal + interest;

        // Print out new principal
        println(String.format("Began with $%.2f", initialPrincipal));
        println(String.format("Earned $%.2f", interest));
        println(String.format("Ended with $%.02f", newPrincipal));
        return newPrincipal;
    }
}
