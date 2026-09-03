package com.sg.foundations.flowcontrol.minizork.location;

import com.sg.foundations.flowcontrol.minizork.MiniZork;
import static com.sg.foundations.flowcontrol.minizork.location.LevelNames.*;
import static com.sg.foundations.utils.QuickOut.println;

public class OakTree extends AbstractLocation{
    public OakTree() {
        super(OAK_TREE.name);
        enterText = new String[]{
                "You reach a giant oak tree, standing alone in the field.",
                "Below the oak tree you notice a small scrap of paper.",
        };

        addChoice("Investigate the note", () -> println("You slowly unfold the crumpled note, inside, in clean handwriting, is a small message saying\n `Hello World!`"));
        addChoice("Go back", () -> MiniZork.moveLocation(GRASSY_FIELD.name));
    }
}
