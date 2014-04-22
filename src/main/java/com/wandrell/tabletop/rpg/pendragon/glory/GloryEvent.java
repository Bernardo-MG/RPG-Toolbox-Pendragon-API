package com.wandrell.tabletop.rpg.pendragon.glory;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface GloryEvent extends NewInstantiable {

    @Override
    public GloryEvent createNewInstance();

    public ValueHandler<Integer> getGloryGained();

    public String getInfo();

    public ValueHandler<Integer> getYear();

}
