package com.wandrell.tabletop.pendragon.model.manor;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.interval.table.IntervalsTable;

public interface Pet extends Prototype {

    public IntervalsTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
