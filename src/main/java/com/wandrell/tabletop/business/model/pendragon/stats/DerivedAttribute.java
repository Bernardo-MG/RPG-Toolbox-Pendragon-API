package com.wandrell.tabletop.business.model.pendragon.stats;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuebox.ValueBox;

public interface DerivedAttribute extends ValueBox {

    public Collection<Attribute> getParentAttributes();

}
