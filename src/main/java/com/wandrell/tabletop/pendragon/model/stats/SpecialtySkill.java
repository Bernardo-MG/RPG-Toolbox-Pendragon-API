package com.wandrell.tabletop.pendragon.model.stats;

import java.util.Collection;

import com.wandrell.tabletop.valuebox.SkillBox;

public interface SpecialtySkill extends SkillBox {

    @Override
    public SpecialtySkill createNewInstance();

    public Collection<String> getSurrogatedSkills();

}
