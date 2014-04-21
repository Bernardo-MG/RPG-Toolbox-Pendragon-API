package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonAggregatedSkill extends ValueHandler<Integer> {

    @Override
    public PendragonAggregatedSkill createNewInstance();

    public Collection<String> getSkillsNames();

    public boolean isSkillContained(final String name);

    public void register(final PendragonSkill vhValue);

}
