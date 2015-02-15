package com.wandrell.tabletop.business.model.pendragon.character;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface DistinctiveFeature extends NewInstantiable {

    @Override
    public DistinctiveFeature createNewInstance();

    public String getDescriptor();

    public String getName();

}
