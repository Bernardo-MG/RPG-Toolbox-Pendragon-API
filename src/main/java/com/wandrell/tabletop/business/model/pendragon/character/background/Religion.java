package com.wandrell.tabletop.business.model.pendragon.character.background;

import java.util.Collection;

public interface Religion {

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDerivedAttributeBonus(final String name);

    public String getName();

    public Collection<String> getReligiousTraits();

    public Boolean hasDerivedAttributeBonus(final String name);

    public Boolean hasTrait(final String name);

}
