package com.wandrell.tabletop.business.model.pendragon.character.background;

import com.wandrell.util.tag.NewInstantiable;

public interface DistinctiveFeature extends NewInstantiable {

    @Override
    public DistinctiveFeature createNewInstance();

    public String getDescriptor();

    public String getName();

}
