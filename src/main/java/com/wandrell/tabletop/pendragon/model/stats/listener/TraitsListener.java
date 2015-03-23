package com.wandrell.tabletop.pendragon.model.stats.listener;

import java.util.EventListener;

import com.wandrell.tabletop.event.ValueChangeEvent;

public interface TraitsListener extends EventListener {

    // TODO: Add a method for each trait
    public void traitChanged(final ValueChangeEvent event);

}
