package com.wandrell.tabletop.rpg.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface ArmorData {

    public ValueHandler<Integer> getArmorPiece(final String name);

    public Collection<ValueHandler<Integer>> getArmorPieces();

    public Boolean hasArmorPiece(final String name);

}
