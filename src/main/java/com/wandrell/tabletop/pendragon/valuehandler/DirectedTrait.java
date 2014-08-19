package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.Descriptor;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface DirectedTrait extends ValueHandler, Descriptor {

    @Override
    public DirectedTrait createNewInstance();

    public ValueHandler getTrait();

}
