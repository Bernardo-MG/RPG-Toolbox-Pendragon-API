package com.wandrell.tabletop.rpg.pendragon.glory;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface FatherClassGlory extends NewInstantiable {

    @Override
    public FatherClassGlory createNewInstance();

    public ValueHandler<Integer> getBaseGlory();

    public ValueHandler<Integer> getGloryPerYear();

    public String getName();

}
