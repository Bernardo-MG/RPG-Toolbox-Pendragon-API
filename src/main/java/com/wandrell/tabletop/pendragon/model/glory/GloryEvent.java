package com.wandrell.tabletop.pendragon.model.glory;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface GloryEvent extends NewInstantiable {

    @Override
    public GloryEvent createNewInstance();

    public String getDescription();

    public Integer getGloryGained();

    public Integer getYear();

}
