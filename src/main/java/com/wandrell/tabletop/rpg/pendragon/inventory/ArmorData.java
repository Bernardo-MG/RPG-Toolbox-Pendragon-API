package com.wandrell.tabletop.rpg.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface ArmorData extends NewInstantiable {

    @Override
    public ArmorData createNewInstance();

    public ValueHandler<Integer> getArmorPiece(final String name);

    public Collection<ValueHandler<Integer>> getArmorPieces();

    public Boolean hasArmorPiece(final String name);

}
