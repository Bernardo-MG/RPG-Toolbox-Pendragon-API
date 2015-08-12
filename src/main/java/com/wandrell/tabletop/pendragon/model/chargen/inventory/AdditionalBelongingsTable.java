package com.wandrell.tabletop.pendragon.model.chargen.inventory;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.interval.table.IntervalsTable;

public interface AdditionalBelongingsTable
        extends IntervalsTable<AdditionalBelongings>, Prototype {

    @Override
    public AdditionalBelongingsTable createNewInstance();

    public String getName();

}
