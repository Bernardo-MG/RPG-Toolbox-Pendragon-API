package com.wandrell.tabletop.pendragon.glory;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface FatherClassGlory extends NewInstantiable {

    @Override
    public FatherClassGlory createNewInstance();

    public ValueHandler<Integer> getBaseGlory();

    public ValueHandler<Integer> getGloryPerYear();

    public String getName();

}
