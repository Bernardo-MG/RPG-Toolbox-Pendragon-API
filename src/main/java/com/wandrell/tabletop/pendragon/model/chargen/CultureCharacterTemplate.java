package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Map;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.skill.SkillName;

public interface CultureCharacterTemplate {

    public Map<String, Integer> getAttributes();

    public Map<String, Dice> getAttributesRandom();

    public Map<SkillName, Integer> getDirectedTraits();

    public Map<SkillName, Integer> getPassions();

    public Map<SkillName, Dice> getPassionsRandom();

    public Map<SkillName, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

    public Map<String, Integer> getTraits();

}
