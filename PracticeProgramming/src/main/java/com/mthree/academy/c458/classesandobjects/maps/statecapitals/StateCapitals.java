package com.mthree.academy.c458.classesandobjects.maps.statecapitals;

import java.util.HashMap;
import java.util.Map;
import static com.mthree.academy.c458.utils.QuickOut.println;

public class StateCapitals {
    public static final Map<String, String> STATES_AND_CAPITALS = buildStateMap();

    public static void main(String[] args) {
        StateCapitals capitals = new StateCapitals();
        capitals.printStates();
        capitals.printCapitals();
        capitals.printPairs();
    }

    public StateCapitals () {}

    /**
     * Prints out State names from the internal map
     */
    public void printStates() {
        println("\nSTATES:");
        println("=======");
        for(String key : STATES_AND_CAPITALS.keySet()) {
            println(key);
        }
    }

    /**
     * Prints out Capital names from the internal map
     */
    public void printCapitals() {
        println("\nCAPITALS:");
        println("=========");
        for(String value : STATES_AND_CAPITALS.values()) {
            println(value);
        }
    }

    /**
     * Prints out State - Capital pairs from the internal map
     */
    public void printPairs() {
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
        stateMap.put("Alabama", "Montgomery");
        stateMap.put("Alaska", "Juneau");
        stateMap.put("Arizona", "Phoenix");
        stateMap.put("Arkansas", "Little Rock");

        return stateMap;
    }
}
