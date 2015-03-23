package com.wandrell.tabletop.pendragon.model.character.event;

import java.util.EventListener;

import com.wandrell.tabletop.pendragon.model.stats.listener.AttributesListener;
import com.wandrell.tabletop.pendragon.model.stats.listener.DerivedAttributesListener;
import com.wandrell.tabletop.pendragon.model.stats.listener.TraitsListener;

public interface PendragonCharacterListener extends EventListener,
        AttributesListener, DerivedAttributesListener, TraitsListener {

}
