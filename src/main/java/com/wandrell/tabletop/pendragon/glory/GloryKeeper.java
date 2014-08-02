package com.wandrell.tabletop.pendragon.glory;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface GloryKeeper {

    public ValueHandler<Integer> getAnnualGlorySource(final String name);

    public Collection<ValueHandler<Integer>> getAnnualGlorySources();

    public Collection<GloryEvent> getHistory();

    public Boolean hasAnnualGlorySource(final String name);

}
