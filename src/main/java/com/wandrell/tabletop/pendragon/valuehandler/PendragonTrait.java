package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonTrait extends ValueHandler<Integer> {

    @Override
    public PendragonTrait createNewInstance();

    public PendragonTrait getMirrorTrait();

    public Boolean isGoodTrait();

}
