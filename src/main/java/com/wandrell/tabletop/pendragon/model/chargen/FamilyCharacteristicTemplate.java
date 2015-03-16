package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Map;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.skill.SkillName;

public interface FamilyCharacteristicTemplate extends NewInstantiable {

    @Override
    public FamilyCharacteristicTemplate createNewInstance();

    public Map<String, Integer> getAttributes();

    public String getName();

    public Map<SkillName, Integer> getSkills();

}
