package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.dice.Dice;

public interface RandomSkill {

    public String getDescriptor();

    public String getName();

    public Dice getValue();

}
