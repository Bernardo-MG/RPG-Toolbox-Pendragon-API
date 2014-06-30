package com.wandrell.tabletop.pendragon.character.follower;

import com.wandrell.tabletop.pendragon.character.PendragonBaseCharacter;
import com.wandrell.util.tag.NewInstantiable;

public interface Follower extends NewInstantiable {

    @Override
    public Follower createNewInstance();

    public PendragonBaseCharacter getCharacter();

    public String getFile();

    public String getJob();

}
