package com.wandrell.tabletop.rpg.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.rpg.character.Gender;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonDirectedTrait;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonPassion;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSpecialtySkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonTrait;

public interface PendragonSimpleCharacter extends PendragonBaseCharacter {

    public void addDirectedTrait(final PendragonDirectedTrait directedTrait);

    public void addPassion(final PendragonPassion passion);

    public void addSkill(final PendragonSkill skill);

    public void addSpecialtySkill(final PendragonSpecialtySkill skill);

    @Override
    public PendragonSimpleCharacter createNewInstance();

    public PendragonDirectedTrait getDirectedTrait(final String name,
	    final String annotation);

    public Collection<PendragonDirectedTrait> getDirectedTraits();

    public Gender getGender();

    public PendragonPassion getPassion(final String name,
	    final String annotation);

    public Collection<PendragonPassion> getPassions();

    public PendragonSkill getSkill(final String name, final String annotation);

    public Collection<PendragonSkill> getSkills();

    public PendragonSpecialtySkill getSpecialtySkill(final String name);

    public Collection<PendragonSpecialtySkill> getSpecialtySkills();

    public PendragonTrait getTrait(final String name);

    public Collection<PendragonTrait> getTraits();

    public boolean hasDirectedTrait(final String name, final String annotation);

    public boolean hasPassion(final String name, final String annotation);

    public boolean hasSkill(final String name, final String annotation);

    public Boolean hasSpecialtySkill(final String name);

    public boolean hasTrait(final String name);

}
