package com.wandrell.tabletop.business.model.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface DerivedAttribute extends EditableValueHandler {

    @Override
    public DerivedAttribute createNewInstance();

    public Collection<Attribute> getParentAttributes();

}
