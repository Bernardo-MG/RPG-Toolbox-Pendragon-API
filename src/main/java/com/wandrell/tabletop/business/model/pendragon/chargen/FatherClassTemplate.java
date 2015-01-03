package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.dice.Dice;
import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public interface FatherClassTemplate {

    public Map<NameAndDescriptor, Integer> getDirectedTraits();

    public Map<NameAndDescriptor, Integer> getDirectedTraitsBase();

    public Dice getMoney();

    public String getName();

    public Integer getNonCombatSkillBonus();

    public Collection<NameAndDescriptor> getSkillsGroup();

    public Integer getSkillsGroupBonusPoints();

    public Integer getSkillsGroupDividePoints();

    public Integer getSkillsPoints();

    public Map<String, Integer> getSpecialtySkills();

}
