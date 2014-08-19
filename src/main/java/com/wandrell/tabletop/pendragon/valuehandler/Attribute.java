package com.wandrell.tabletop.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface Attribute extends ValueHandler {

    @Override
    public Attribute createNewInstance();

    public Collection<ValueHandler> getDerivedAttributes();

}
