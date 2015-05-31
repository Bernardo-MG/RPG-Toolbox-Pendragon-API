package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.dice.notation.DiceFormula;

public interface AttributesRandom {

    public DiceFormula getAppearance();

    public DiceFormula getConstitution();

    public DiceFormula getDexterity();

    public DiceFormula getSize();

    public DiceFormula getStrength();

}
