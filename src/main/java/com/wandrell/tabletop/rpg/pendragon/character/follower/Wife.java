package com.wandrell.tabletop.rpg.pendragon.character.follower;

import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.character.PendragonBaseCharacter;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface Wife {

    public PendragonBaseCharacter getCharacter();

    public Collection<Child> getChildren();

    public String getFile();

    public ValueHandler<Integer> getYearWed();

}
