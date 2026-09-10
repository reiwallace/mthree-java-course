package com.mthree.academy.c458.basics.flowcontrol.minizork.location;

import com.mthree.academy.c458.basics.flowcontrol.minizork.MiniZork;
import static com.mthree.academy.c458.basics.flowcontrol.minizork.consts.LevelNames.*;

public class GrassyField extends AbstractLocation{
    public GrassyField() {
        super(GRASSY_FIELD.name);
        enterText = new String[]{
                "You are stood in the middle of an open field.",
                "A slow wind rolls gently over the tall grass.",
                "In this distance, you see a farmhouse, roof collapsed from years of neglect.",
                "Bearing east of the farmhouse, a lone oak watches over the vast field.",
        };

        addChoice("Go to the farmhouse", () -> MiniZork.moveLocation(FARMHOUSE.name));
        addChoice("Investigate the Oak Tree", () -> MiniZork.moveLocation(OAK_TREE.name));
        addChoice("Go home",
                () -> {
                    System.out.println("You turn around and head home.");
                    MiniZork.stopGame();
                });
    }
}
