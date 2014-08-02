package com.wandrell.tabletop.pendragon.character.follower;

import com.wandrell.tabletop.pendragon.character.PendragonBaseCharacter;

public interface Follower {

    public PendragonBaseCharacter getCharacter();

    public String getFile();

    public String getJob();

}
