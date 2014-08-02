package com.wandrell.tabletop.pendragon.manor;

import com.wandrell.tabletop.dice.RollTable;

public interface ManorAnimal {

    public RollTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
