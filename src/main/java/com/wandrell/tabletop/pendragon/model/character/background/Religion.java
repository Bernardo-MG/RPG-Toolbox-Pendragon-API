package com.wandrell.tabletop.pendragon.model.character.background;

import java.util.Collection;
import java.util.Map;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface Religion extends NewInstantiable {

    @Override
    public Religion createNewInstance();

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDamageDiceBonus();

    public Map<String, Integer> getDerivedAttributeBonus();

    public String getName();

    public Collection<String> getReligiousTraits();

}
