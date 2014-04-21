package com.wandrell.tabletop.rpg.pendragon.glory;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface GloryController {

    public ValueHandler<Integer> getAnnualGlorySource(final String name);

    public Collection<ValueHandler<Integer>> getAnnualGlorySources();

    public Collection<GloryEvent> getGloryEvents();

    public Boolean hasAnnualGlorySource(final String name);

}
