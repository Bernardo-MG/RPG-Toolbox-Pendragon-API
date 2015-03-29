package com.wandrell.tabletop.pendragon.model.character.background;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.pendragon.model.character.stats.DerivedAttributesHolder;

public interface Religion extends Prototype {

    @Override
    public Religion createNewInstance();

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDamageDiceBonus();

    public DerivedAttributesHolder getDerivedAttributeBonus();

    public String getName();

    public Collection<String> getReligiousTraits();

}
