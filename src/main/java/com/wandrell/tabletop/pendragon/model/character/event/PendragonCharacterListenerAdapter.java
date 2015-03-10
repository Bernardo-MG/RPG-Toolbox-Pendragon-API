package com.wandrell.tabletop.pendragon.model.character.event;

import com.wandrell.tabletop.event.ValueChangeEvent;

public class PendragonCharacterListenerAdapter implements
        PendragonCharacterListener {

    @Override
    public void appearanceChanged(final ValueChangeEvent event) {}

    @Override
    public void constitutionChanged(final ValueChangeEvent event) {}

    @Override
    public void dexterityChanged(final ValueChangeEvent event) {}

    @Override
    public void sizeChanged(final ValueChangeEvent event) {}

    @Override
    public void strengthChanged(final ValueChangeEvent event) {}

}
