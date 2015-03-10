package com.wandrell.tabletop.pendragon.model.character.event;

import com.wandrell.tabletop.event.ValueChangeEvent;

public class PendragonCharacterListenerAdapter implements
        PendragonCharacterListener {

    @Override
    public void appearanceChanged(final ValueChangeEvent event) {}

    @Override
    public void constitutionChanged(final ValueChangeEvent event) {}

    @Override
    public void damageChanged(final ValueChangeEvent event) {}

    @Override
    public void dexterityChanged(final ValueChangeEvent event) {}

    @Override
    public void dexterityRollChanged(final ValueChangeEvent event) {}

    @Override
    public void healingRateChanged(final ValueChangeEvent event) {}

    @Override
    public void hitPointsChanged(final ValueChangeEvent event) {}

    @Override
    public void knockdownChanged(final ValueChangeEvent event) {}

    @Override
    public void majorWoundChanged(final ValueChangeEvent event) {}

    @Override
    public void moveRateChanged(final ValueChangeEvent event) {}

    @Override
    public void sizeChanged(final ValueChangeEvent event) {}

    @Override
    public void strengthChanged(final ValueChangeEvent event) {}

    @Override
    public void unconciousChanged(final ValueChangeEvent event) {}

    @Override
    public void weightChanged(final ValueChangeEvent event) {}

}
