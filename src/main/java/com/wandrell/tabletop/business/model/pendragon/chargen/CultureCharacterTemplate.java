package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Map;

import com.wandrell.tabletop.business.model.dice.Dice;
import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public interface CultureCharacterTemplate {

    public Map<String, Integer> getAttributes();

    public Map<String, Dice> getAttributesRandom();

    public Map<NameAndDescriptor, Integer> getDirectedTraits();

    public Map<NameAndDescriptor, Integer> getPassions();

    public Map<NameAndDescriptor, Dice> getPassionsRandom();

    public Map<NameAndDescriptor, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

    public Map<String, Integer> getTraits();

}
