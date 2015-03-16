package com.wandrell.tabletop.pendragon.model.manor;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.interval.IntervalTable;

public interface Pet extends NewInstantiable {

    public IntervalTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
