package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Map;

import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public interface FamilyCharacteristicTemplate {

    public Map<String, Integer> getAttributes();

    public String getFamilyCharacteristic();

    public Map<NameAndDescriptor, Integer> getSkills();

}
