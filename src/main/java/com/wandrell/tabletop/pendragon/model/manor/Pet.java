package com.wandrell.tabletop.pendragon.model.manor;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.interval.IntervalTable;

public interface Pet extends Prototype {

    public IntervalTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
