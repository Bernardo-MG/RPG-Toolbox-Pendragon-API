package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.Descriptor;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface Passion extends ValueHandler, Descriptor {

    @Override
    public Passion createNewInstance();

}