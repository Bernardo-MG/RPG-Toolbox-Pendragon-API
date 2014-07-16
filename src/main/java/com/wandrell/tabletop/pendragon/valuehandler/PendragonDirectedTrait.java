package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.Descriptor;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonDirectedTrait extends ValueHandler<Integer>,
	Descriptor {

    @Override
    public PendragonDirectedTrait createNewInstance();

    public ValueHandler<Integer> getTrait();

}
