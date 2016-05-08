
package com.wandrell.tabletop.pendragon.model.chargen.stats;

import com.wandrell.tabletop.dice.notation.DiceNotationExpression;

public interface RandomSkill {

    public String getDescriptor();

    public String getName();

    public DiceNotationExpression getValue();

}
