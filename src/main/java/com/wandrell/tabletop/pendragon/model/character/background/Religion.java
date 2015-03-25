package com.wandrell.tabletop.pendragon.model.character.background;

import java.util.Collection;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface Religion extends NewInstantiable {

    @Override
    public Religion createNewInstance();

    public Integer getArmorBonus();

    public Integer getDamageBonus();

    public Integer getDamageDiceBonus();

    public Collection<SkillBox> getDerivedAttributeBonus();

    public String getName();

    public Collection<String> getReligiousTraits();

}
