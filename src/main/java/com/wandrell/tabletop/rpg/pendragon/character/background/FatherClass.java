package com.wandrell.tabletop.rpg.pendragon.character.background;

import java.util.Collection;
import java.util.Iterator;

import com.wandrell.tabletop.rpg.pendragon.inventory.PendragonMoneyData;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSkill;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface FatherClass {

    public void addSkillsPoints(final ValueHandler<Integer> vhValue);

    public PendragonMoneyData getMoneyData();

    public String getName();

    public Iterator<PendragonSkill> getSkillsGroupIterator();

    public ValueHandler<Integer> getSkillsGroupPoints();

    public Collection<ValueHandler<Integer>> getSkillsPoints();

    public ValueHandler<Integer> getSkillsPoints(final String name);

    public boolean hasSkillsPoints(final String name);

    public void setSkillPoints(
	    final Iterator<? extends ValueHandler<Integer>> itrPoints);

    public void setSkillsGroup(final Collection<PendragonSkill> skills,
	    final ValueHandler<Integer> vhPoints);

}
