package com.wandrell.tabletop.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonAttribute extends ValueHandler<Integer> {

    @Override
    public PendragonAttribute createNewInstance();

    public Collection<ValueHandler<Integer>> getDerivedAttributes();

}
