package com.wandrell.tabletop.pendragon.model.character.background;

import java.util.Collection;
import java.util.Map;

public interface Religion {

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDamageDiceBonus();

    public Map<String, Integer> getDerivedAttributeBonus();

    public String getName();

    public Collection<String> getReligiousTraits();

}
