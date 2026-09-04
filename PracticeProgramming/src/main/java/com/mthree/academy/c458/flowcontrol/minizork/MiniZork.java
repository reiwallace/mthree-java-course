package com.mthree.academy.c458.flowcontrol.minizork;

import com.mthree.academy.c458.flowcontrol.minizork.location.AbstractLocation;
import com.mthree.academy.c458.flowcontrol.minizork.location.FarmHouse;
import com.mthree.academy.c458.flowcontrol.minizork.location.GrassyField;
import com.mthree.academy.c458.flowcontrol.minizork.location.OakTree;
import java.util.HashMap;
import java.util.Map;
import static com.mthree.academy.c458.flowcontrol.minizork.consts.LevelNames.*;

public class MiniZork {
    private static boolean running = true;
    private static AbstractLocation currentLocation;
    private static final Map<String, AbstractLocation> locations = new HashMap<>();

    public static void main(String[] args) {
        setUpGameLocations();
        moveLocation(GRASSY_FIELD.name);

        // Keep asking choices until the game is stopped
        while(running) {
            currentLocation.askChoices();
        }
    }

    /**
     * Loads game locations into the location map
     */
    private static void setUpGameLocations() {
        locations.put(GRASSY_FIELD.name, new GrassyField());
        locations.put(OAK_TREE.name, new OakTree());
        locations.put(FARMHOUSE.name, new FarmHouse());
    }

    /**
     * Moves the player to another location
     * @param name String name of the location
     */
    public static void moveLocation(String name) {
        currentLocation = locations.get(name);
        currentLocation.enter();
    }

    /**
     * Stops the game loop
     */
    public static void stopGame() {
        running = false;
    }
}
