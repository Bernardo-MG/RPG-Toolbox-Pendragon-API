package com.wandrell.tabletop.rpg.pendragon.character.background;

import com.wandrell.util.tag.NewInstantiable;

public interface Homeland extends NewInstantiable {

    @Override
    public Homeland createNewInstance();

    public String getName();

}
