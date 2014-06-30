package com.wandrell.tabletop.pendragon.glory;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface GloryEvent extends NewInstantiable, Comparable<GloryEvent> {

    @Override
    public GloryEvent createNewInstance();

    public String getDescription();

    public ValueHandler<Integer> getGloryGained();

    public ValueHandler<Integer> getYear();

}
