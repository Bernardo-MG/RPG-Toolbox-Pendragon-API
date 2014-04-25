package com.wandrell.tabletop.rpg.pendragon.character.background;

import java.util.Collection;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Religion extends NewInstantiable {

    @Override
    public Religion createNewInstance();

    public ValueHandler<Integer> getArmorBonus();

    public ValueHandler<Integer> getDamageBonus();

    public ValueHandler<Integer> getDerivedAttributeBonus(final String name);

    public Collection<ValueHandler<Integer>> getDerivedAttributesBonus();

    public String getName();

    public Collection<String> getReligiousTraits();

    public boolean hasDerivedAttributeBonus(final String name);

    public boolean hasTrait(final String trait);

}
