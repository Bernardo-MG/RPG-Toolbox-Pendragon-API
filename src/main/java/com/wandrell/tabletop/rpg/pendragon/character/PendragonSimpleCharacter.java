package com.wandrell.tabletop.rpg.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.rpg.character.Gender;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonAggregatedSkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonDirectedTrait;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonPassion;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSkill;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonTrait;

public interface PendragonSimpleCharacter extends PendragonBaseCharacter {

    public void addAdvancedSkill(final PendragonAggregatedSkill vhAdvSkill);

    public void addDirectedTrait(final PendragonDirectedTrait vhDirTrait);

    public void addPassion(final PendragonPassion vhPassion);

    public void addSkill(final PendragonSkill vhSkill);

    public PendragonAggregatedSkill getAdvancedSkill(final String advSkill);

    public Collection<PendragonAggregatedSkill> getAdvancedSkills();

    public PendragonDirectedTrait getDirectedTrait(final String dirTrait,
	    final String annotation);

    public Collection<PendragonDirectedTrait> getDirectedTraits();

    public Gender getGender();

    public PendragonPassion getPassion(final String passion,
	    final String annotation);

    public Collection<PendragonPassion> getPassions();

    public PendragonSkill getSkill(final String skill, final String annotation);

    public Collection<PendragonSkill> getSkills();

    public PendragonTrait getTrait(final String trait);

    public Collection<PendragonTrait> getTraits();

    public Boolean hasAdvancedSkill(final String advSkill);

    public boolean hasDirectedTrait(final String dirTrait,
	    final String annotation);

    public boolean hasPassion(final String passion, final String annotation);

    public boolean hasSkill(final String skill, final String annotation);

    public boolean hasTrait(final String name);

    public void removePassion(final String passion, final String annotation);

}
