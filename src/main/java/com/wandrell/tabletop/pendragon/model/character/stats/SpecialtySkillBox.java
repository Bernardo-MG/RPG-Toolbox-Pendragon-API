package com.wandrell.tabletop.pendragon.model.character.stats;

import java.util.Collection;

import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface SpecialtySkillBox extends SkillBox {

    public Collection<String> getSurrogatedSkills();

}
