
package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.tabletop.dice.notation.DiceNotationExpression;
import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface FatherClassTemplate {

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getDirectedTraitsBase();

    public DiceNotationExpression getMoney();

    public String getName();

    public Integer getNonCombatSkillBonus();

    public Collection<SkillBox> getSkillsGroup();

    public Integer getSkillsGroupBonusPoints();

    public Integer getSkillsGroupDividePoints();

    public Integer getSkillsPoints();

    public Collection<SkillBox> getSpecialtySkills();

}
