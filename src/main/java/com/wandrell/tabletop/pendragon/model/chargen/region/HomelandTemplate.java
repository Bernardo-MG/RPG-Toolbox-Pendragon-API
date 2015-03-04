package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.skill.SkillName;

public interface HomelandTemplate {

    public Collection<SkillName> getDirectedTraits();

    public String getHomeland();

    public Collection<SkillName> getPassions();

    public RegionTemplate getRegion();

    public Map<SkillName, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

}
