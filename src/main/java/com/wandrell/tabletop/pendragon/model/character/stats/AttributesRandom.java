
package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.dice.notation.DiceNotationExpression;

public interface AttributesRandom {

    public DiceNotationExpression getAppearance();

    public DiceNotationExpression getConstitution();

    public DiceNotationExpression getDexterity();

    public DiceNotationExpression getSize();

    public DiceNotationExpression getStrength();

}
