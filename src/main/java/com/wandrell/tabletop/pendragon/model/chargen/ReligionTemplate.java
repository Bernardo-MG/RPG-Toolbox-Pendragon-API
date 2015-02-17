package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Collection;
import java.util.Map;

public interface ReligionTemplate {

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDamageDiceBonus();

    public Map<String, Integer> getDerivedAttributeBonus();

    public String getReligion();

    public Collection<String> getReligiousTraits();

}
