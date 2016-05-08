
package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.AttributesRandom;
import com.wandrell.tabletop.pendragon.model.character.stats.TraitsHolder;
import com.wandrell.tabletop.pendragon.model.chargen.stats.RandomSkill;
import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface CultureCharacterTemplate {

    public AttributesHolder getAttributes();

    public AttributesRandom getAttributesRandom();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getPassions();

    public Collection<RandomSkill> getPassionsRandom();

    public Collection<SkillBox> getSkills();

    public Collection<SkillBox> getSpecialtySkills();

    public TraitsHolder getTraits();

}
