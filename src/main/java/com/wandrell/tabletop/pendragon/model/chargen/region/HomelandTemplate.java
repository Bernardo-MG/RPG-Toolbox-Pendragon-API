
package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Collection;

import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface HomelandTemplate {

    public Collection<SkillBox> getDirectedTraits();

    public String getName();

    public Collection<SkillBox> getPassions();

    public RegionTemplate getRegion();

    public Collection<SkillBox> getSkills();

    public Collection<SkillBox> getSpecialtySkills();

}
