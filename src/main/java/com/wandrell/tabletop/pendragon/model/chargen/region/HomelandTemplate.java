
package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.stats.DirectedTrait;
import com.wandrell.tabletop.pendragon.model.character.stats.Passion;
import com.wandrell.tabletop.pendragon.model.character.stats.PendragonSkill;
import com.wandrell.tabletop.pendragon.model.character.stats.SpecialtySkill;

public interface HomelandTemplate {

    public Collection<DirectedTrait> getDirectedTraits();

    public String getName();

    public Collection<Passion> getPassions();

    public RegionTemplate getRegion();

    public Collection<PendragonSkill> getSkills();

    public Collection<SpecialtySkill> getSpecialtySkills();

}
