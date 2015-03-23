package com.wandrell.tabletop.pendragon.model.character.stats.listener;

import java.util.EventListener;

import com.wandrell.tabletop.event.ValueChangeEvent;

public interface AttributesListener extends EventListener {

    public void appearanceChanged(final ValueChangeEvent event);

    public void constitutionChanged(final ValueChangeEvent event);

    public void dexterityChanged(final ValueChangeEvent event);

    public void sizeChanged(final ValueChangeEvent event);

    public void strengthChanged(final ValueChangeEvent event);

}
