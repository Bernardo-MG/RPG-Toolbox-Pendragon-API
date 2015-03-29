package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.pendragon.model.character.stats.event.DerivedAttributesListener;

public interface DerivedAttributesHolder {

    public void addDerivedAttributesListener(
            final DerivedAttributesListener listener);

    public Integer getDamage();

    public Integer getDexterityRoll();

    public Integer getHealingRate();

    public Integer getHitPoints();

    public Integer getKnockdown();

    public Integer getMajorWoundTreshold();

    public Integer getMoveRate();

    public Integer getUnconciousTreshold();

    public Integer getWeight();

    public void removeDerivedAttributesListener(
            final DerivedAttributesListener listener);

    public void setAttributesHolder(final AttributesHolder attributes);

}
