package com.wandrell.tabletop.pendragon.model.character.stats.event;

import java.util.EventListener;

import com.wandrell.tabletop.stat.event.ValueChangeEvent;

public interface TraitsListener extends EventListener {

    // TODO: Add a method for each trait
    public void traitChanged(final ValueChangeEvent event);

}
