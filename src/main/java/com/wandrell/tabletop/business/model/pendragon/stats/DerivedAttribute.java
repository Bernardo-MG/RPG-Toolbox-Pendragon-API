package com.wandrell.tabletop.business.model.pendragon.stats;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;

public interface DerivedAttribute extends ValueHandler {

    @Override
    public DerivedAttribute createNewInstance();

    public Collection<Attribute> getParentAttributes();

}
