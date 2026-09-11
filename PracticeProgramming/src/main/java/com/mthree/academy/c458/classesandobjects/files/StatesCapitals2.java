package com.mthree.academy.c458.classesandobjects.files;

import com.mthree.academy.c458.utils.UserInputUtils;

import java.io.*;
import java.util.*;

import static com.mthree.academy.c458.utils.QuickOut.println;

public class StatesCapitals2 {
    public static final Map<String, String> STATES_AND_CAPITALS = buildStateMap();
    private static final Random RNG = new Random();

    public static void main(String[] args) throws IOException {
        println(STATES_AND_CAPITALS.size() + " STATES & CAPITALS ARE LOADED");
        printStates();

        println("READY TO TEST YOUR KNOWLEDGE?");
        println("HOW MANY STATE CAPITALS WOULD YOU LIKE TO GUESS? 1-" + STATES_AND_CAPITALS.size());
        int amount = UserInputUtils.retrieveIntegerInputInRange(1, STATES_AND_CAPITALS.size());
        List<Object> keyset = new ArrayList<>(Arrays.asList(STATES_AND_CAPITALS.keySet().toArray()));

        int score = 0;

        for(int i = 0; i < amount; i++) {
            String nextState = (String) keyset.get(RNG.nextInt(keyset.size()));
            String nextCapital = STATES_AND_CAPITALS.get(nextState);
            println("WHAT IS THE CAPITAL OF '" + nextState + "'?");

            String input = UserInputUtils.retrieveNormalisedStringInput();
            if (input.equals(nextCapital.toLowerCase())) {
                println("NICE WORK! " + nextCapital + " IS CORRECT!");
                score += 1;
            } else {
                println("UNLUCKY! THE ANSWER IS: " + nextCapital);
                score -= 1;
            }
            keyset.remove(nextState);
        }

        println("AND THAT'S ALL! YOUR TOTAL SCORE WAS " + score + "!!");
    }

    public static void printStates() {
        println("HERE ARE THE STATES:");
        StringBuilder line = new StringBuilder();
        for(String key : STATES_AND_CAPITALS.keySet()) {
            line.append(key);
            line.append(", ");
        }
        line.setCharAt(line.length() - 2, ' ');
        line.setCharAt(line.length() - 1, '.');
        line.append("..");
        println(line.toString());
    }

    /**
     * Prints out Capital names from the internal map
     */
    public static void printCapitals() {
        println("\nCAPITALS:");
        println("=========");
        for(String value : STATES_AND_CAPITALS.values()) {
            println(value);
        }
    }

    /**
     * Prints out State - Capital pairs from the internal map
     */
    public static void printPairs() {
        println("\nSTATE/CAPITAL PAIRS:");
        println("====================");
        for(Map.Entry<String, String> entry : STATES_AND_CAPITALS.entrySet()) {
            println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /**
     * Creates a new HashMap and adds states and their corresponding capitals to it
     * @return The completed HashMap
     */
    private static Map<String, String> buildStateMap() {
        Map<String, String> stateMap = new HashMap<>();
        try {
            Scanner fileIn = new Scanner(new BufferedReader(new FileReader("output/StateCapitals.txt")));
            fileIn.useDelimiter("::|\\n");
            String key;
            String val;
            while(fileIn.hasNext()) {
                key = fileIn.next();
                if(!fileIn.hasNext()) break;
                val = fileIn.next();
                stateMap.put(key, val);
            }
        } catch (FileNotFoundException ignored) {}

        return stateMap;
    }
}
