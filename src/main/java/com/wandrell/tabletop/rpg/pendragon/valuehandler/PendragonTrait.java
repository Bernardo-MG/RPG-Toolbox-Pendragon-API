package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonTrait extends ValueHandler<Integer> {

    @Override
    public PendragonTrait createNewInstance();

    public PendragonTrait getMirrorTrait();

    public Boolean isGoodTrait();

}
