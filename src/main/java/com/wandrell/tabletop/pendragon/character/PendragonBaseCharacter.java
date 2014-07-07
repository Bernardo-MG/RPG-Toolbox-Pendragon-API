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

    public PendragonAttribute getDamage();

    public Collection<PendragonDerivedAttribute> getDerivedAttributes();

    public PendragonAttribute getDexterity();

    public PendragonAttribute getHealingRate();

    public PendragonAttribute getHitPoints();

    public PendragonAttribute getMoveRate();

    public String getName();

    public PendragonAttribute getSize();

    public PendragonAttribute getStrength();

    public PendragonAttribute getUnconsciousTreshold();

    public Boolean hasAttribute(final String name);

    public Boolean hasDerivedAttribute(final String name);

}
