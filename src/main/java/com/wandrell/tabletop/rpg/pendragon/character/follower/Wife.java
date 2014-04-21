package com.wandrell.tabletop.rpg.pendragon.character.follower;

import java.util.Iterator;

import com.wandrell.tabletop.rpg.pendragon.character.PendragonBaseCharacter;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface Wife {

    public PendragonBaseCharacter getCharacter();

    public Iterator<Child> getChildren();

    public String getFile();

    public ValueHandler<Integer> getYearWed();

}
