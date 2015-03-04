package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Map;

import com.wandrell.tabletop.skill.SkillName;

public interface FamilyCharacteristicTemplate {

    public Map<String, Integer> getAttributes();

    public String getName();

    public Map<SkillName, Integer> getSkills();

}
