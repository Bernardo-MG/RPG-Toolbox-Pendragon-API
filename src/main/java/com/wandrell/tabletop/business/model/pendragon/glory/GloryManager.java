package com.wandrell.tabletop.business.model.pendragon.glory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;

public interface GloryManager {

    public ValueHandler getChivaldryGlory();

    public Collection<GloryEvent> getEvents();

    public ValueHandler getGentlewomanGlory();

    public ValueHandler getPassionsGlory();

    public ValueHandler getReligiousGlory();

    public ValueHandler getTraitsGlory();

    public ValueHandler getYearlyGlory();

}
