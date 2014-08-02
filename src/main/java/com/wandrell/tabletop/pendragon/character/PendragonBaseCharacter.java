package com.wandrell.tabletop.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.Attribute;
import com.wandrell.tabletop.pendragon.valuehandler.DerivedAttribute;
import com.wandrell.util.tag.NewInstantiable;

public interface PendragonBaseCharacter extends NewInstantiable {

    public void addDerivedAttribute(final DerivedAttribute attribute);

    @Override
    public PendragonBaseCharacter createNewInstance();

    public Attribute getAppearance();

    public Collection<Attribute> getAttributes();

    public Attribute getConstitution();

    public DerivedAttribute getDamage();

    public Collection<DerivedAttribute> getDerivedAttributes();

    public Attribute getDexterity();

    public DerivedAttribute getDexterityRoll();

    public DerivedAttribute getHealingRate();

    public DerivedAttribute getHitPoints();

    public DerivedAttribute getMajorWoundTreshold();

    public DerivedAttribute getMovementRate();

    public String getName();

    public DerivedAttribute getSize();

    public Attribute getStrength();

    public DerivedAttribute getUnconsciousTreshold();

    public DerivedAttribute getWeight();

    public Boolean hasAttribute(final String name);

    public Boolean hasDerivedAttribute(final String name);

}
