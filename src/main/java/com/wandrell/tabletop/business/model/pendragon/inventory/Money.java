package com.wandrell.tabletop.business.model.pendragon.inventory;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Money extends NewInstantiable {

    @Override
    public Money createNewInstance();

    public EditableValueHandler getDenarii();

    public EditableValueHandler getLibra();

}
