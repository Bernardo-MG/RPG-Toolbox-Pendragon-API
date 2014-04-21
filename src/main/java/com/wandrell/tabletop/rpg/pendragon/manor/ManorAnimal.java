package com.wandrell.tabletop.rpg.pendragon.manor;

import com.wandrell.tabletop.rpg.dice.RollTable;

public interface ManorAnimal {

    public RollTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
