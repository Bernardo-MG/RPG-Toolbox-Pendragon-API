package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Map;

public interface FamilyCharacteristicBonus {

    public Map<String, Integer> getAttributes();

    public String getFamilyCharacteristic();

    public Map<String, Integer> getSkills();

}
