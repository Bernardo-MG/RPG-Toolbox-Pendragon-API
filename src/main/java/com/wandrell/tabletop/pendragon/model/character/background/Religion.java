
package com.wandrell.tabletop.pendragon.model.character.background;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.stats.DerivedAttributesHolder;

public interface Religion {

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDamageDiceBonus();

    public DerivedAttributesHolder getDerivedAttributeBonus();

    public String getName();

    public Collection<String> getReligiousTraits();

}
