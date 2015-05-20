package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.DerivedAttributesHolder;
import com.wandrell.tabletop.stats.valuebox.ValueBox;

public interface DerivedAttributeBuilder {

    public ValueBox getDamage(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getDexterityRoll(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getHealingRate(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getHitPoints(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getKnockdown(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getMajorWoundTreshold(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getMoveRate(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getUnconciousTreshold(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public ValueBox getWeight(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

}
