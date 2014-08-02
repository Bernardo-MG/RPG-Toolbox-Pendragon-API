package com.wandrell.tabletop.pendragon.character.background;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.PendragonMoney;
import com.wandrell.tabletop.pendragon.valuehandler.Skill;
import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface FatherClass extends NewInstantiable {

    public void addSkillsPoints(final ValueHandler<Integer> vhValue);

    @Override
    public FatherClass createNewInstance();

    public PendragonMoney getMoney();

    public String getName();

    public Collection<Skill> getSkillsGroup();

    public ValueHandler<Integer> getSkillsGroupPoints();

    public Collection<ValueHandler<Integer>> getSkillsPoints();

    public ValueHandler<Integer> getSkillsPoints(final String name);

    public Boolean hasSkillsPoints(final String name);

}
