
package com.wandrell.tabletop.pendragon.model.manor;

import com.wandrell.tabletop.interval.table.IntervalsTable;

public interface Pet {

    public IntervalsTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
