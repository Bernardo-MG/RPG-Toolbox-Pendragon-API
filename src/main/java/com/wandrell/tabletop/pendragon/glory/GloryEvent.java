package com.wandrell.tabletop.pendragon.glory;

import com.wandrell.util.tag.NewInstantiable;

public interface GloryEvent extends NewInstantiable {

    @Override
    public GloryEvent createNewInstance();

    public String getDescription();

    public Integer getGloryGained();

    public Integer getYear();

}
