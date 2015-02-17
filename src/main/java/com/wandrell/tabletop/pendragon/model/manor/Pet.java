package com.wandrell.tabletop.pendragon.model.manor;

import com.wandrell.tabletop.interval.IntervalTable;

public interface Pet {

    public IntervalTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
