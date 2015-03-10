package com.wandrell.tabletop.pendragon.model.character.event;

import java.util.EventListener;

import com.wandrell.tabletop.event.ValueChangeEvent;

public interface PendragonCharacterListener extends EventListener {

    public void appearanceChanged(final ValueChangeEvent event);

    public void constitutionChanged(final ValueChangeEvent event);

    public void damageChanged(final ValueChangeEvent event);

    public void dexterityChanged(final ValueChangeEvent event);

    public void dexterityRollChanged(final ValueChangeEvent event);

    public void healingRateChanged(final ValueChangeEvent event);

    public void hitPointsChanged(final ValueChangeEvent event);

    public void knockdownChanged(final ValueChangeEvent event);

    public void majorWoundChanged(final ValueChangeEvent event);

    public void moveRateChanged(final ValueChangeEvent event);

    public void sizeChanged(final ValueChangeEvent event);

    public void strengthChanged(final ValueChangeEvent event);

    public void unconciousChanged(final ValueChangeEvent event);

    public void weightChanged(final ValueChangeEvent event);

}
