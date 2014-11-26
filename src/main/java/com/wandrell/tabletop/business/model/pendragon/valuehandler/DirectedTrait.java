package com.wandrell.tabletop.business.model.pendragon.valuehandler;

import com.wandrell.tabletop.business.model.valuehandler.Descriptor;
import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface DirectedTrait extends EditableValueHandler, Descriptor {

    @Override
    public DirectedTrait createNewInstance();

    public EditableValueHandler getTrait();

}
