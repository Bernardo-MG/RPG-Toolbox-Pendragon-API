package com.wandrell.tabletop.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.pendragon.valuehandler.PendragonDerivedAttribute;
import com.wandrell.util.tag.NewInstantiable;

public interface PendragonBaseCharacter extends NewInstantiable {

    public void addDerivedAttribute(final PendragonDerivedAttribute attribute);

    @Override
    public PendragonBaseCharacter createNewInstance();

    public PendragonAttribute getAppearance();

    public Collection<PendragonAttribute> getAttributes();

    public PendragonAttribute getConstitution();

    public PendragonDerivedAttribute getDamage();

    public Collection<PendragonDerivedAttribute> getDerivedAttributes();

    public PendragonAttribute getDexterity();

    public PendragonDerivedAttribute getDexterityRoll();

    public PendragonDerivedAttribute getHealingRate();

    public PendragonDerivedAttribute getHitPoints();

    public PendragonDerivedAttribute getMajorWoundTreshold();

    public PendragonDerivedAttribute getMovementRate();

    public String getName();

    public PendragonDerivedAttribute getSize();

    public PendragonAttribute getStrength();

    public PendragonDerivedAttribute getUnconsciousTreshold();

    public PendragonDerivedAttribute getWeight();

    public Boolean hasAttribute(final String name);

    public Boolean hasDerivedAttribute(final String name);

}
