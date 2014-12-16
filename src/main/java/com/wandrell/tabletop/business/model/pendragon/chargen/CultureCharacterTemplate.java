package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Map;

public interface CultureCharacterTemplate {

    public Map<String, Integer> getAttributes();

    public Map<String, Integer> getDerivedAttributes();

    public Map<String, Integer> getDirectedTraits();

    public Map<String, Integer> getExclusiveSkills();

    public Map<String, Integer> getPassions();

    public Map<String, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

    public Map<String, Integer> getTraits();

}
