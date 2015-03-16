package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Collection;
import java.util.Map;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.skill.SkillName;

public interface HomelandTemplate extends NewInstantiable {

    @Override
    public HomelandTemplate createNewInstance();

    public Collection<SkillName> getDirectedTraits();

    public String getName();

    public Collection<SkillName> getPassions();

    public RegionTemplate getRegion();

    public Map<SkillName, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

}
