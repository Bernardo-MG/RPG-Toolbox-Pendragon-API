package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.dice.notation.DiceFormula;

public interface RandomSkill {

    public String getDescriptor();

    public String getName();

    public DiceFormula getValue();

}
