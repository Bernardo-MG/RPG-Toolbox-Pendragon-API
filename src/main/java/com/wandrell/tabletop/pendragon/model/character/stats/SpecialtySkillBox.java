package com.wandrell.tabletop.pendragon.model.character.stats;

import java.util.Collection;

import com.wandrell.tabletop.valuebox.SkillBox;

public interface SpecialtySkillBox extends SkillBox {

    @Override
    public SpecialtySkillBox createNewInstance();

    public Collection<String> getSurrogatedSkills();

}
