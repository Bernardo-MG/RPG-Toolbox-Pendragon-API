package com.wandrell.tabletop.rpg.pendragon.character.background;

import com.wandrell.util.tag.NewInstantiable;

public interface Homeland extends NewInstantiable {

    public String getName();
    
    public Homeland createNewInstance();

}
