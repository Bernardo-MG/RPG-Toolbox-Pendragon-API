package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.Annotated;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonDirectedTrait extends ValueHandler<Integer>,
	Annotated {

    @Override
    public PendragonDirectedTrait createNewInstance();

    public ValueHandler<Integer> getTrait();

}
