package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.pendragon.model.character.PendragonCharacter;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface FamilyCharacteristicTemplate extends Prototype {

    @Override
    public FamilyCharacteristicTemplate createNewInstance();

    public PendragonCharacter getAttributes();

    public String getName();

    public Collection<SkillBox> getSkills();

}
