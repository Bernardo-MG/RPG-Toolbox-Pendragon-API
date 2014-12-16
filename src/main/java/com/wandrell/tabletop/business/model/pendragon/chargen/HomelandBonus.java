package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Map;

public interface HomelandBonus {

    public Map<String, String> getDirectedTraitsBonus();

    public String getHomeland();

    public Map<String, String> getPassionsBonus();

    public Map<String, Integer> getSkillsBonus();

    public Map<String, Integer> getTraitsBonus();

}
