package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonDirectedTrait extends ValueHandler<Integer> {

    @Override
    public PendragonDirectedTrait createNewInstance();

    public ValueHandler<Integer> getTrait();

}
