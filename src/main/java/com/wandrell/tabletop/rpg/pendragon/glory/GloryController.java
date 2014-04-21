package com.wandrell.tabletop.rpg.pendragon.glory;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface GloryController extends NewInstantiable {

    @Override
    public GloryController createNewInstance();

    public ValueHandler<Integer> getAnnualGlorySource(final String name);

    public Collection<ValueHandler<Integer>> getAnnualGlorySources();

    public Collection<GloryEvent> getGloryEvents();

    public Boolean hasAnnualGlorySource(final String name);

}
