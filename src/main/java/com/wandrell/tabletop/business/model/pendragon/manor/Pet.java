package com.wandrell.tabletop.business.model.pendragon.manor;

import com.wandrell.tabletop.business.model.dice.RollTable;

public interface Pet {

    public RollTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
