package com.wandrell.tabletop.business.model.pendragon.character;

import com.wandrell.tabletop.business.model.pendragon.valuehandler.Attribute;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.DerivedAttribute;
import com.wandrell.util.tag.NewInstantiable;

public interface PendragonBaseCharacter extends NewInstantiable {

    @Override
    public PendragonBaseCharacter createNewInstance();

    public Attribute getConstitution();

    public DerivedAttribute getDamage();

    public Attribute getDexterity();

    public DerivedAttribute getDexterityRoll();

    public DerivedAttribute getHealingRate();

    public DerivedAttribute getHitPoints();

    public DerivedAttribute getMajorWoundTreshold();

    public DerivedAttribute getMovementRate();

    public String getName();

    public Attribute getSize();

    public Attribute getStrength();

    public DerivedAttribute getUnconsciousTreshold();

    public DerivedAttribute getWeight();

}
