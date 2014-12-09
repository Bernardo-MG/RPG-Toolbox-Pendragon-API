package com.wandrell.tabletop.business.model.pendragon.character.background;

import java.util.Map;

public interface FamilyCharacteristic {

    public Map<String, Integer> getAttributes();

    public String getName();

    public Map<String, Integer> getSkills();

}
