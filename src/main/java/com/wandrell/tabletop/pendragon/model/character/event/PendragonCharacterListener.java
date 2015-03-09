package com.wandrell.tabletop.pendragon.model.character.event;

import java.util.EventListener;

import com.wandrell.tabletop.event.ValueChangeEvent;

public interface PendragonCharacterListener extends EventListener {

    public void attributesChanged(final ValueChangeEvent event);

}
