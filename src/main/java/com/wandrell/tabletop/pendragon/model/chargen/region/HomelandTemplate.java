package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.skill.NameAndDescriptor;

public interface HomelandTemplate {

    public Collection<NameAndDescriptor> getDirectedTraits();

    public String getHomeland();

    public Collection<NameAndDescriptor> getPassions();

    public String getRegion();

    public Map<NameAndDescriptor, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

}
