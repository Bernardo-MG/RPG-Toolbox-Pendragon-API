package com.wandrell.tabletop.rpg.pendragon.character.background.culture;

import java.util.Collection;

import com.wandrell.tabletop.rpg.interval.Interval;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonAggregatedSkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonDirectedTrait;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonPassion;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonTrait;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface CultureCharacterTemplate {

    public PendragonAggregatedSkill getAdvancedSkill(final String name);

    public Collection<PendragonAggregatedSkill> getAdvancedSkills();

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

    public PendragonTrait getTrait(final String name);

    public Collection<PendragonTrait> getTraits();

    public String getValuesText();

    public boolean hasAdvancedSkill(final String name);

    public boolean hasAttribute(final String name);

    public boolean hasAttributeInterval(final String name);

    public boolean hasDerivedAttribute(final String name);

    public boolean hasDirectedTrait(final String name, final String annotation);

    public boolean hasExclusiveSkill(final String name, final String annotation);

    public boolean hasPassion(final String name, final String annotation);

    public boolean hasSkill(final String name, final String annotation);

    public boolean hasTrait(final String name);

}
