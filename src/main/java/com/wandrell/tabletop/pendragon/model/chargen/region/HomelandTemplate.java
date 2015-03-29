package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface HomelandTemplate extends Prototype {

    @Override
    public HomelandTemplate createNewInstance();

    public Collection<SkillBox> getDirectedTraits();

    public String getName();

    public Collection<SkillBox> getPassions();

    public RegionTemplate getRegion();

    public Collection<SkillBox> getSkills();

    public Collection<SkillBox> getSpecialtySkills();

}
