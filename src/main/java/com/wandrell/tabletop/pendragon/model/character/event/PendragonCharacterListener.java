
package com.wandrell.tabletop.pendragon.model.character.event;

import java.util.EventListener;

import com.wandrell.tabletop.pendragon.model.character.stats.event.AttributesListener;
import com.wandrell.tabletop.pendragon.model.character.stats.event.DerivedAttributesListener;
import com.wandrell.tabletop.pendragon.model.character.stats.event.TraitsListener;

public interface PendragonCharacterListener extends EventListener,
        AttributesListener, DerivedAttributesListener, TraitsListener {

}
