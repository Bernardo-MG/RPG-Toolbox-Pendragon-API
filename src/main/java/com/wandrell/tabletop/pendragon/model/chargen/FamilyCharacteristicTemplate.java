package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Map;

import com.wandrell.tabletop.skill.NameAndDescriptor;

public interface FamilyCharacteristicTemplate {

    public Map<String, Integer> getAttributes();

    public String getName();

    public Map<NameAndDescriptor, Integer> getSkills();

}
