package com.wandrell.tabletop.pendragon.glory;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface GloryKeeper extends NewInstantiable {

    @Override
    public GloryKeeper createNewInstance();

    public ValueHandler<Integer> getAnnualGlorySource(final String name);

    public Collection<ValueHandler<Integer>> getAnnualGlorySources();

    public Collection<GloryEvent> getHistory();

    public Boolean hasAnnualGlorySource(final String name);

}
