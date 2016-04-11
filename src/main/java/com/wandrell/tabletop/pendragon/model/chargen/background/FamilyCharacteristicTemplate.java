
package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface FamilyCharacteristicTemplate {

    public AttributesHolder getAttributes();

    public String getName();

    public Collection<SkillBox> getSkills();

}
