
package com.wandrell.tabletop.pendragon.model.glory;

import java.util.Collection;

import com.wandrell.tabletop.stats.valuebox.ValueBox;

public interface GloryManager {

    public ValueBox getChivaldryGlory();

    public Collection<GloryEvent> getEvents();

    public ValueBox getGentlewomanGlory();

    public ValueBox getPassionsGlory();

    public ValueBox getReligiousGlory();

    public ValueBox getTraitsGlory();

    public ValueBox getYearlyGlory();

}
