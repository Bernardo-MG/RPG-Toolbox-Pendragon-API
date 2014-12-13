package com.wandrell.tabletop.business.model.pendragon.manor;

import com.wandrell.tabletop.business.model.interval.IntervalTable;

public interface Pet {

    public IntervalTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
