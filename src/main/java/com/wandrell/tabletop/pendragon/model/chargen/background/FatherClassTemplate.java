
package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.tabletop.dice.notation.DiceNotationExpression;
import com.wandrell.tabletop.pendragon.model.character.stats.DirectedTrait;
import com.wandrell.tabletop.pendragon.model.character.stats.PendragonSkill;
import com.wandrell.tabletop.pendragon.model.character.stats.SpecialtySkill;

public interface FatherClassTemplate {

    public Collection<DirectedTrait> getDirectedTraits();

    public Collection<DirectedTrait> getDirectedTraitsBase();

    public DiceNotationExpression getMoney();

    public String getName();

    public Integer getNonCombatSkillBonus();

    public Collection<PendragonSkill> getSkillsGroup();

    public Integer getSkillsGroupBonusPoints();

    public Integer getSkillsGroupDividePoints();

    public Integer getSkillsPoints();

    public Collection<SpecialtySkill> getSpecialtySkills();

}
