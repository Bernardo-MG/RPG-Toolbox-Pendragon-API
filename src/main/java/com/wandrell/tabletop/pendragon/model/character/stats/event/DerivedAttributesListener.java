
package com.wandrell.tabletop.pendragon.model.character.stats.event;

import java.util.EventListener;

import com.wandrell.tabletop.stats.event.ValueChangeEvent;

public interface DerivedAttributesListener extends EventListener {

    public void damageChanged(final ValueChangeEvent event);

    public void dexterityRollChanged(final ValueChangeEvent event);

    public void healingRateChanged(final ValueChangeEvent event);

    public void hitPointsChanged(final ValueChangeEvent event);

    public void knockdownChanged(final ValueChangeEvent event);

    public void majorWoundChanged(final ValueChangeEvent event);

    public void moveRateChanged(final ValueChangeEvent event);

    public void unconciousChanged(final ValueChangeEvent event);

    public void weightChanged(final ValueChangeEvent event);

}
