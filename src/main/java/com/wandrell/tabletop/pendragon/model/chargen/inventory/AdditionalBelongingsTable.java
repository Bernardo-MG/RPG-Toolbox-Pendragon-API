package com.wandrell.tabletop.pendragon.model.chargen.inventory;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.interval.IntervalTable;

public interface AdditionalBelongingsTable extends
        IntervalTable<AdditionalBelongings>, Prototype {

    @Override
    public AdditionalBelongingsTable createNewInstance();

    public String getName();

}
