package com.sg.foundations.flowcontrol.minizork.location;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.sg.foundations.utils.QuickOut.println;

public abstract class AbstractLocation {
    private final Scanner input = new Scanner(System.in);
    private final String name;
    protected String[] enterText;
    protected Map<String, Runnable> choices = new HashMap<>();

    public AbstractLocation(String name) { this.name = name; }

    /**
     * Runs the choice if in the level's choices or Tells the user they cannot do that choice
     * @param choice Choice string
     */
    public void checkChoice(String choice) {
        choice = choice.toLowerCase().strip();
        if(choices.containsKey(choice)) {
            choices.get(choice).run();
        } else {
            println("You cannot " + choice);
        }
    }

    /**
     * Enters the area, printing out area related text
     */
    public void enter() {
        for(String line : enterText) {
            println(line);
        }
    }

    /**
     * Ask choices
     */
    public void askChoices() {
        println("Will you...");
        for(String option : choices.keySet()) {
            println(option);
        }
        checkChoice(input.nextLine());
    }

    /**
     * Noramlises choice name then adds it to the list
     * @param name Choice name
     * @param function Runnable function
     */
    public void addChoice(String name, Runnable function) {
        name = name.toLowerCase().strip();
        choices.put(name, function);
    }

    public String getName() { return name; }
}
