package com.mthree.academy.c458.basics.finalpractice.factorizer;

import com.mthree.academy.c458.utils.UserInputUtils;
import java.util.HashSet;
import java.util.Set;
import static com.mthree.academy.c458.utils.QuickOut.println;
import static com.mthree.academy.c458.utils.QuickOut.print;

public class Factoriser {
    public static void main(String[] args) {
        new Factoriser();
    }
    
    public Factoriser() {
        // Prompt for number
        println("What number would you like to factor?");
        int num = UserInputUtils.retrieveIntegerInput();

        // Calculate fields
        Set<Integer> factors = getFactors(num);
        boolean prime = isPrime(factors);
        boolean perfect = prime ? false : isPerfect(num, factors);

        println("\n" + num + " has " + factors.size() + " factors.");
        println(num + " is " + (perfect ? "" : "not ") + "a perfect number.");
        println(num + " is " + (prime ? "" : "not ") + "a prime number.");
    }

    private static boolean isPrime(Set<Integer> factors) {
        return factors.size() < 3;
    }

    private static boolean isPerfect(int num, Set<Integer> factors) {
        int total = 0;
        for(int i : factors) {
            if(i == num) continue;
            total += i;
        }
        return total == num;
    }

    private static Set<Integer> getFactors(int num) {
        Set<Integer> factors = new HashSet<>();
        for(int i = 1; i <= num / 2 + 1; i++) {
            float remainder = (float) num / i;
            if(remainder % 1 > 0 || factors.contains(i)) continue;
            factors.add(i);
            print(i + " ");
            if(num == 1) continue;
            factors.add((int) remainder);
            print((int) remainder + " ");
        }
        return factors;
    }
}
