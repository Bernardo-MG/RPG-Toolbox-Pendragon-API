package com.wandrell.tabletop.business.model.pendragon.stats;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuebox.EditableValueBox;

public interface Attribute extends EditableValueBox {

    @Override
    public Attribute createNewInstance();

    public Collection<DerivedAttribute> getDerivedAttributes();

}
