package com.wandrell.tabletop.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.pendragon.valuehandler.DirectedTrait;
import com.wandrell.tabletop.pendragon.valuehandler.Passion;
import com.wandrell.tabletop.pendragon.valuehandler.Skill;
import com.wandrell.tabletop.pendragon.valuehandler.SpecialtySkill;
import com.wandrell.tabletop.pendragon.valuehandler.Trait;

public interface PendragonSimpleCharacter extends PendragonBaseCharacter {

    public void addDirectedTrait(final DirectedTrait directedTrait);

    public void addPassion(final Passion passion);

    public void addSkill(final Skill skill);

    public void addSpecialtySkill(final SpecialtySkill skill);

    @Override
    public PendragonSimpleCharacter createNewInstance();

    public DirectedTrait getDirectedTrait(final String name,
            final String annotation);

    public Collection<DirectedTrait> getDirectedTraits();

    public Gender getGender();

    public Passion getPassion(final String name, final String annotation);

    public Collection<Passion> getPassions();

    public Skill getSkill(final String name, final String annotation);

    public Collection<Skill> getSkills();

    public SpecialtySkill getSpecialtySkill(final String name);

    public Collection<SpecialtySkill> getSpecialtySkills();

    public Trait getTrait(final String name);

    public Collection<Trait> getTraits();

    public Boolean hasDirectedTrait(final String name, final String annotation);

    public Boolean hasPassion(final String name, final String annotation);

    public Boolean hasSkill(final String name, final String annotation);

    public Boolean hasSpecialtySkill(final String name);

    public Boolean hasTrait(final String name);

}
