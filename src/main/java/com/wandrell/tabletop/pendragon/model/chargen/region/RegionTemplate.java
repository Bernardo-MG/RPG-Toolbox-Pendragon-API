package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Collection;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface RegionTemplate extends NewInstantiable {

    @Override
    public RegionTemplate createNewInstance();

    public String getName();

    public Collection<SkillBox> getTraits();

}
