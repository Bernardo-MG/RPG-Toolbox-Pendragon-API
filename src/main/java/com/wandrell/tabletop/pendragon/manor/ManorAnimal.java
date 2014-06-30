package com.wandrell.tabletop.pendragon.manor;

import com.wandrell.tabletop.dice.RollTable;
import com.wandrell.util.tag.NewInstantiable;

public interface ManorAnimal extends NewInstantiable {

    @Override
    public ManorAnimal createNewInstance();

    public RollTable<AnimalYearResult> getAnnualCheckMap();

    public String getName();

}
