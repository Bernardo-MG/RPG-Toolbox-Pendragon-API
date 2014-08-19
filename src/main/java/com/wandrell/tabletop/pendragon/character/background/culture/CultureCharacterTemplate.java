package com.wandrell.tabletop.pendragon.character.background.culture;

import java.util.Collection;

import com.wandrell.tabletop.interval.Interval;
import com.wandrell.tabletop.pendragon.valuehandler.Attribute;
import com.wandrell.tabletop.pendragon.valuehandler.DirectedTrait;
import com.wandrell.tabletop.pendragon.valuehandler.Passion;
import com.wandrell.tabletop.pendragon.valuehandler.Skill;
import com.wandrell.tabletop.pendragon.valuehandler.SpecialtySkill;
import com.wandrell.tabletop.pendragon.valuehandler.Trait;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface CultureCharacterTemplate {

    public Attribute getAttribute(final String name);

    public Interval getAttributeInterval(final String name);

    public Collection<Interval> getAttributeIntervals();

    public Collection<Attribute> getAttributes();

    public ValueHandler getDerivedAttribute(final String name);

    public Collection<ValueHandler> getDerivedAttributes();

    public DirectedTrait getDirectedTrait(final String name,
            final String annotation);

    public Collection<DirectedTrait> getDirectedTraits();

    public Skill getExclusiveSkill(final String name, final String annotation);

    public Collection<Skill> getExclusiveSkills();

    public Passion getPassion(final String name, final String annotation);

    public Collection<Passion> getPassions();

    public Skill getSkill(final String name, final String annotation);

    public Collection<Skill> getSkills();

    public SpecialtySkill getSpecialtySkill(final String name);

    public Collection<SpecialtySkill> getSpecialtySkills();

    public Trait getTrait(final String name);

    public Collection<Trait> getTraits();

    public String getValuesText();

    public Boolean hasAttribute(final String name);

    public Boolean hasAttributeInterval(final String name);

    public Boolean hasDerivedAttribute(final String name);

    public Boolean hasDirectedTrait(final String name, final String annotation);

    public Boolean
            hasExclusiveSkill(final String name, final String annotation);

    public Boolean hasPassion(final String name, final String annotation);

    public Boolean hasSkill(final String name, final String annotation);

    public Boolean hasSpecialtySkill(final String name);

    public Boolean hasTrait(final String name);

}
