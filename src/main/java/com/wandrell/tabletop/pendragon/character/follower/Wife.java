package com.wandrell.tabletop.pendragon.character.follower;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.character.PendragonBaseCharacter;

public interface Wife {

    public PendragonBaseCharacter getCharacter();

    public Collection<Child> getChildren();

    public String getFile();

    public Integer getYearWed();

}
