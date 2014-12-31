package com.wandrell.tabletop.business.model.pendragon.stats;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuebox.SkillBox;

public interface SpecialtySkill extends SkillBox {

    @Override
    public SpecialtySkill createNewInstance();

    public Collection<String> getSurrogatedSkills();

}
