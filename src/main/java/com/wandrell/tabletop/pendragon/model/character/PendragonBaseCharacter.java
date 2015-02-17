package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface PendragonBaseCharacter extends NewInstantiable {

    @Override
    public PendragonBaseCharacter createNewInstance();

    public Integer getConstitution();

    public Integer getDamage();

    public Integer getDexterity();

    public Integer getDexterityRoll();

    public Integer getHealingRate();

    public Integer getHitPoints();

    public Integer getMajorWoundTreshold();

    public Integer getMovementRate();

    public String getName();

    public Integer getSize();

    public Integer getStrength();

    public Integer getUnconsciousTreshold();

    public Integer getWeight();

    public void setConstitution(final Integer constitution);

    public void setDexterity(final Integer dexterity);

    public void setSize(final Integer size);

    public void setStrength(final Integer strength);

}
