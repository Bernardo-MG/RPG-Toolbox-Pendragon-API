package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface FamilyCharacteristicTemplate extends NewInstantiable {

    @Override
    public FamilyCharacteristicTemplate createNewInstance();

    public Collection<SkillBox> getAttributes();

    public String getName();

    public Collection<SkillBox> getSkills();

}
