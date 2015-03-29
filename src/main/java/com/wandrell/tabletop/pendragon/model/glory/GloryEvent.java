package com.wandrell.tabletop.pendragon.model.glory;

import com.wandrell.pattern.prototype.Prototype;

public interface GloryEvent extends Prototype {

    @Override
    public GloryEvent createNewInstance();

    public String getDescription();

    public Integer getGloryGained();

    public Integer getYear();

}
