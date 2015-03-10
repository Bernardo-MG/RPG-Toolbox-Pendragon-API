package com.wandrell.tabletop.pendragon.model.character.event;

import java.util.EventListener;

import com.wandrell.tabletop.event.ValueChangeEvent;

public interface PendragonCharacterListener extends EventListener {

    public void appearanceChanged(final ValueChangeEvent event);

    public void constitutionChanged(final ValueChangeEvent event);

    public void dexterityChanged(final ValueChangeEvent event);

    public void sizeChanged(final ValueChangeEvent event);

    public void strengthChanged(final ValueChangeEvent event);

}
