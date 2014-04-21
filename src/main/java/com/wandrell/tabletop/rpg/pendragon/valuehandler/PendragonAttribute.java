package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonAttribute extends ValueHandler<Integer> {

    public Collection<ValueHandler<Integer>> getDerivedAttributes();

}
