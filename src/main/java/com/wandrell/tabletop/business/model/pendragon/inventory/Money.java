package com.wandrell.tabletop.business.model.pendragon.inventory;

import com.wandrell.tabletop.business.model.valuebox.EditableValueBox;
import com.wandrell.util.tag.NewInstantiable;

public interface Money extends NewInstantiable {

    @Override
    public Money createNewInstance();

    public EditableValueBox getDenarii();

    public EditableValueBox getLibra();

}
