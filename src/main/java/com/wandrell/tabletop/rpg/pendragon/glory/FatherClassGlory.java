package com.wandrell.tabletop.rpg.pendragon.glory;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface FatherClassGlory {

    public ValueHandler<Integer> getBaseGlory();

    public ValueHandler<Integer> getGloryPerYear();

    public String getName();

}
