package com.wandrell.tabletop.business.model.pendragon.valuehandler;

import com.wandrell.tabletop.business.model.valuehandler.Descriptor;
import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface DistinctiveFeature extends EditableValueHandler, Descriptor {

    @Override
    public DistinctiveFeature createNewInstance();

}
