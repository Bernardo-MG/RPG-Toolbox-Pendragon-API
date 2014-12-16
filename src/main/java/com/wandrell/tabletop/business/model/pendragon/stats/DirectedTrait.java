package com.wandrell.tabletop.business.model.pendragon.stats;

import com.wandrell.tabletop.business.model.valuehandler.Descriptor;
import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface DirectedTrait extends EditableValueHandler, Descriptor {

    @Override
    public DirectedTrait createNewInstance();

    public Trait getTrait();

}
