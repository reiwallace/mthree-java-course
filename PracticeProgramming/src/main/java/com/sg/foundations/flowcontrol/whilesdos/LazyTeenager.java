package com.sg.foundations.flowcontrol.whilesdos;

import static com.sg.foundations.utils.QuickOut.println;

public class LazyTeenager {
    public static void main(String[] args) {
        double chance = 0.1;

        // If the randon number is ever below current chance end loop (random = 0.7, chance = 0.1 - keep going)
        while(Math.random() > chance) {
            println("Clean your room!!");
            chance += 0.1;
            if(chance == 0.8) {
                // Print final statement and return so the alternative final statement is never ran
                println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                return;
            }
        }
        // Final statement
        println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
    }
}
