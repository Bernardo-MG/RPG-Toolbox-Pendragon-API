package com.wandrell.tabletop.business.model.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface Attribute extends EditableValueHandler {

    @Override
    public Attribute createNewInstance();

    public Collection<EditableValueHandler> getDerivedAttributes();

}
