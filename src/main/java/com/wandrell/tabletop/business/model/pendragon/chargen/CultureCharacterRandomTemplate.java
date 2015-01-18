package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Map;

import com.wandrell.tabletop.business.model.dice.Dice;
import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public interface CultureCharacterRandomTemplate {

    public Map<String, Dice> getAttributes();

    public Map<NameAndDescriptor, Dice> getDirectedTraits();

    public Map<NameAndDescriptor, Dice> getPassions();

    public Map<NameAndDescriptor, Dice> getSkills();

    public Map<String, Dice> getSpecialtySkills();

    public Map<String, Dice> getTraits();

}
