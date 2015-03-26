package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.pendragon.model.character.stats.TraitsHolder;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface CultureCharacterTemplate {

    public Collection<SkillBox> getAttributes();

    public Map<String, Dice> getAttributesRandom();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getPassions();

    public Map<SkillBox, Dice> getPassionsRandom();

    public Collection<SkillBox> getSkills();

    public Collection<SkillBox> getSpecialtySkills();

    public TraitsHolder getTraits();

}
