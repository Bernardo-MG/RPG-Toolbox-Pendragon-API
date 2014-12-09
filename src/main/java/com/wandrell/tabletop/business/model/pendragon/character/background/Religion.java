package com.wandrell.tabletop.business.model.pendragon.character.background;

import java.util.Collection;
import java.util.Map;

public interface Religion {

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Map<String, Integer> getDerivedAttributeBonus();

    public String getName();

    public Collection<String> getReligiousTraits();

}
