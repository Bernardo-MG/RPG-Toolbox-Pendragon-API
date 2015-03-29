package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.pattern.prototype.Prototype;

public interface DistinctiveFeature extends Prototype {

    @Override
    public DistinctiveFeature createNewInstance();

    public String getDescriptor();

    public String getName();

}
