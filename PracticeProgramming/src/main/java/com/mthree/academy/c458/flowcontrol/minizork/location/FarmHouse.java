package com.mthree.academy.c458.flowcontrol.minizork.location;

import com.mthree.academy.c458.flowcontrol.minizork.MiniZork;

import static com.mthree.academy.c458.flowcontrol.minizork.consts.LevelNames.*;
import static com.mthree.academy.c458.utils.QuickOut.println;

public class FarmHouse extends AbstractLocation {
    public FarmHouse() {
        super(FARMHOUSE.name);
        enterText = new String[]{
                "As you approach the farmhouse you realise \"I really don't have time for this\".",
        };

        addChoice("Waste time", () -> println("You stare at the farmhouse for a while..."));
        addChoice("Go back", () -> MiniZork.moveLocation(GRASSY_FIELD.name));
    }
}
