package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.tabletop.valuebox.ValueBox;

public interface DerivedAttributeBuilder {

    public ValueBox getDamage(final PendragonBaseCharacter character);

    public ValueBox getDexterityRoll(final PendragonBaseCharacter character);

    public ValueBox getHealingRate(final PendragonBaseCharacter character);

    public ValueBox getHitPoints(final PendragonBaseCharacter character);

    public ValueBox
            getMajorWoundTreshold(final PendragonBaseCharacter character);

    public ValueBox getMoveRate(final PendragonBaseCharacter character);

    public ValueBox
            getUnconciousTreshold(final PendragonBaseCharacter character);

    public ValueBox getWeight(final PendragonBaseCharacter character);

}
