package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonSpecialtySkill extends ValueHandler<Integer> {

    @Override
    public PendragonSpecialtySkill createNewInstance();

    public Collection<String> getSurrogatedSkills();

    public Boolean isSkillContained(final String name);

    public void registerSkill(final PendragonSkill skill);

}
