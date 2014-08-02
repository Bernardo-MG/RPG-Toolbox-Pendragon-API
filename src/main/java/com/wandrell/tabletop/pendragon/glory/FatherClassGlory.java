package com.wandrell.tabletop.pendragon.glory;

import com.wandrell.util.tag.NewInstantiable;

public interface FatherClassGlory extends NewInstantiable {

    @Override
    public FatherClassGlory createNewInstance();

    public Integer getBaseGlory();

    public Integer getGloryPerYear();

    public String getName();

}
