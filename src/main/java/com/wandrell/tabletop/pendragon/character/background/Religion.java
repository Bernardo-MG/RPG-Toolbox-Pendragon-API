package com.wandrell.tabletop.pendragon.character.background;

import java.util.Collection;

import com.wandrell.util.tag.NewInstantiable;

public interface Religion extends NewInstantiable {

    @Override
    public Religion createNewInstance();

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDerivedAttributeBonus(final String name);

    public String getName();

    public Collection<String> getReligiousTraits();

    public Boolean hasDerivedAttributeBonus(final String name);

    public Boolean hasTrait(final String name);

}
