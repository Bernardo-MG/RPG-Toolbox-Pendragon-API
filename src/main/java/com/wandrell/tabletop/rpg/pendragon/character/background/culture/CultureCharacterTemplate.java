package com.wandrell.tabletop.rpg.pendragon.character.background.culture;

import java.util.Collection;

import com.wandrell.tabletop.rpg.interval.Interval;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonDirectedTrait;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonPassion;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSpecialtySkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonTrait;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface CultureCharacterTemplate extends NewInstantiable {

    public PendragonAttribute getAttribute(final String name);

    public Interval<Integer> getAttributeInterval(final String name);

    public Collection<Interval<Integer>> getAttributeIntervals();

    public Collection<PendragonAttribute> getAttributes();

    public ValueHandler<Integer> getDerivedAttribute(final String name);

    public Collection<ValueHandler<Integer>> getDerivedAttributes();

    public PendragonDirectedTrait getDirectedTrait(final String name,
	    final String annotation);

    public Collection<PendragonDirectedTrait> getDirectedTraits();

    public PendragonSkill getExclusiveSkill(final String name,
	    final String annotation);

    public Collection<PendragonSkill> getExclusiveSkills();

    public PendragonPassion getPassion(final String name,
	    final String annotation);

    public Collection<PendragonPassion> getPassions();

    public PendragonSkill getSkill(final String name, final String annotation);

    public Collection<PendragonSkill> getSkills();

    public PendragonSpecialtySkill getSpecialtySkill(final String name);

    public Collection<PendragonSpecialtySkill> getSpecialtySkills();

    public PendragonTrait getTrait(final String name);

    public Collection<PendragonTrait> getTraits();

    public String getValuesText();

    public Boolean hasAttribute(final String name);

    public Boolean hasAttributeInterval(final String name);

    public Boolean hasDerivedAttribute(final String name);

    public Boolean hasDirectedTrait(final String name, final String annotation);

    public Boolean hasExclusiveSkill(final String name, final String annotation);

    public Boolean hasPassion(final String name, final String annotation);

    public Boolean hasSkill(final String name, final String annotation);

    public Boolean hasSpecialtySkill(final String name);

    public Boolean hasTrait(final String name);

}
