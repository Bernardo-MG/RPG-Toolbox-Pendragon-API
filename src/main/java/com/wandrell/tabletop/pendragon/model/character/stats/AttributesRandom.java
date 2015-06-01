package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.dice.notation.DiceExpression;

public interface AttributesRandom {

    public DiceExpression getAppearance();

    public DiceExpression getConstitution();

    public DiceExpression getDexterity();

    public DiceExpression getSize();

    public DiceExpression getStrength();

}
