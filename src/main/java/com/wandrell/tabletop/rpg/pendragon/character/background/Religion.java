package com.wandrell.tabletop.rpg.pendragon.character.background;

import java.util.Collection;
import java.util.Iterator;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface Religion {

    public ValueHandler<Integer> getArmorBonus();

    public ValueHandler<Integer> getDamageBonus();

    public ValueHandler<Integer> getDerivedAttributeBonus(final String name);

    public Collection<ValueHandler<Integer>> getDerivedAttributesBonus();

    public String getName();

    public Iterator<String> getReligiousTraitsIterator();

    public boolean hasDerivedAttributeBonus(final String name);

    public boolean hasTrait(final String trait);

}
