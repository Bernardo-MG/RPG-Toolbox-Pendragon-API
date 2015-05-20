package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface FatherClassTemplate extends Prototype {

    @Override
    public FatherClassTemplate createNewInstance();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getDirectedTraitsBase();

    public Dice getMoney();

    public String getName();

    public Integer getNonCombatSkillBonus();

    public Collection<SkillBox> getSkillsGroup();

    public Integer getSkillsGroupBonusPoints();

    public Integer getSkillsGroupDividePoints();

    public Integer getSkillsPoints();

    public Collection<SkillBox> getSpecialtySkills();

}
