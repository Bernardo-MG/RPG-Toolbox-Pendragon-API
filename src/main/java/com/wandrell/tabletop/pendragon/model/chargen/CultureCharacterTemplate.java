package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Map;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.skill.NameAndDescriptor;

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
