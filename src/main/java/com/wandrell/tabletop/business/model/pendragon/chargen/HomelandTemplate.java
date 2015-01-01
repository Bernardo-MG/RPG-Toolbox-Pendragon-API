package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public interface HomelandTemplate {

    public Collection<NameAndDescriptor> getDirectedTraits();

    public String getHomeland();

    public Collection<NameAndDescriptor> getPassions();

    public Map<NameAndDescriptor, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

    public Map<String, Integer> getTraits();

}
