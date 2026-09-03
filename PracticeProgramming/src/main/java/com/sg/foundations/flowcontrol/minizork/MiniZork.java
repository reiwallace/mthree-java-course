package com.sg.foundations.flowcontrol.minizork;

import com.sg.foundations.flowcontrol.minizork.location.AbstractLocation;
import com.sg.foundations.flowcontrol.minizork.location.FarmHouse;
import com.sg.foundations.flowcontrol.minizork.location.GrassyField;
import com.sg.foundations.flowcontrol.minizork.location.OakTree;

import java.util.HashMap;
import java.util.Map;

import static com.sg.foundations.flowcontrol.minizork.location.LevelNames.*;

public class MiniZork {
    private static boolean running = true;
    private static AbstractLocation currentLocation;
    private static final Map<String, AbstractLocation> locations = new HashMap<>();

    public static void main(String[] args) {
        setUpGameLocations();
        moveLocation(GRASSY_FIELD.name);
        while(running) {
            currentLocation.askChoices();
        }
    }

    private static void setUpGameLocations() {
        locations.put(GRASSY_FIELD.name, new GrassyField());
        locations.put(OAK_TREE.name, new OakTree());
        locations.put(FARMHOUSE.name, new FarmHouse());
    }

    public static void moveLocation(String name) {
        currentLocation = locations.get(name);
        currentLocation.enter();
    }

    public static void stopGame() {
        running = false;
    }
}
