package com.wandrell.tabletop.pendragon.model.chargen.inventory;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.interval.IntervalTable;

public interface AdditionalBelongingsTable extends
        IntervalTable<AdditionalBelongings>, NewInstantiable {

    @Override
    public AdditionalBelongingsTable createNewInstance();

    public String getName();

}
