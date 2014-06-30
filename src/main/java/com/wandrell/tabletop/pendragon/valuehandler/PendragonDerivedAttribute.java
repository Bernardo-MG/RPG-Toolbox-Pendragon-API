package com.wandrell.tabletop.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonDerivedAttribute extends ValueHandler<Integer> {

    @Override
    public PendragonDerivedAttribute createNewInstance();

    public Collection<PendragonAttribute> getParentAttributes();

}
