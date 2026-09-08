package com.mthree.academy.c458.finalpractice.interestcalculator;

import com.mthree.academy.c458.utils.UserInputUtils;
import static com.mthree.academy.c458.utils.QuickOut.println;

public class InterestCalculator {
    private static final int DAILY = 1;
    private static final int MONTHLY = 2;
    private static final int QUARTERLY = 3;
    
    private double principal;
    private double interestRate;
    private int compoundType;
    private int yearsToInvest;

    public static void main(String[] args) {
        InterestCalculator calculator = new InterestCalculator();
        calculator.loadThroughConsole();
        calculator.calculateInterest();
    }
    
    public InterestCalculator() {}
    public InterestCalculator(double principal, double interestRate, int compoundType) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.compoundType = compoundType;
    }

    /**
     * Get object values through a series of user prompts and scanner inputs
     */
    public void loadThroughConsole() {
        println("How much do you want to invest?");
        principal = UserInputUtils.retrievePositiveDoubleInput();

        println("How many years are investing?");
        yearsToInvest = UserInputUtils.retrievePositiveIntegerInput();

        println("What is the annual interest rate % growth?");
        interestRate = UserInputUtils.retrievePositiveDoubleInput() / 100D;

        println("What is your compound period?");
        println("1) Daily    2) Monthly    3) Quarterly");
        compoundType = UserInputUtils.retrieveIntegerInputInRange(1, 3);
    }

    /**
     * Calculates interest for the entire cycle
     */
    public void calculateInterest() {
        println("Calculating...");
        for(int i = 1; i <= yearsToInvest; i++) {
            println("\nYear " + i + ":");
            calculateYearsInterest();
        }
    }

    /**
     * Calculates interest for one year
     */
    private void calculateYearsInterest() {
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
            interest += (principal + interest) * interestPer;
        }
        double newPrincipal = principal + interest;

        // Print out new principal
        println(String.format("Began with $%.2f", principal));
        println(String.format("Earned $%.2f", interest));
        println(String.format("Ended with $%.02f", newPrincipal));
        principal = newPrincipal;
    }
}
