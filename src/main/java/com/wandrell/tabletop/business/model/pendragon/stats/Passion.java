package com.wandrell.tabletop.business.model.pendragon.stats;

import com.wandrell.tabletop.business.model.valuehandler.Descriptor;
import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface Passion extends EditableValueHandler, Descriptor {

    @Override
    public Passion createNewInstance();

}
