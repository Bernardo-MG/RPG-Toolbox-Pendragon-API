package com.wandrell.tabletop.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface DerivedAttribute extends ValueHandler {

    @Override
    public DerivedAttribute createNewInstance();

    public Collection<Attribute> getParentAttributes();

}
