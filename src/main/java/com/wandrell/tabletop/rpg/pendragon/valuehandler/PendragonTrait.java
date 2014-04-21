package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonTrait extends ValueHandler<Integer> {

    public PendragonTrait getMirrorTrait();

    public boolean isGoodTrait();

}
