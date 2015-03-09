package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.tabletop.valuebox.ValueBox;

public interface DerivedAttributeBuilder {

    public ValueBox getDamage(final PendragonBaseCharacter character);

    public ValueBox getDexterityRoll(final PendragonBaseCharacter character);

    public ValueBox getHealingRate(final PendragonBaseCharacter character);

    public ValueBox getHitPoints(final PendragonBaseCharacter character);

    public ValueBox
            getMajorWoundTreshold(final PendragonBaseCharacter character);

    public ValueBox getMovementRate(final PendragonBaseCharacter character);

    public ValueBox getUnconsciousTreshold(
            final PendragonBaseCharacter character);

    public ValueBox getWeight(final PendragonBaseCharacter character);

}
