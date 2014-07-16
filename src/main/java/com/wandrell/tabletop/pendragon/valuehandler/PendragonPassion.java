package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.Descriptor;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonPassion extends ValueHandler<Integer>, Descriptor {

    @Override
    public PendragonPassion createNewInstance();

}
