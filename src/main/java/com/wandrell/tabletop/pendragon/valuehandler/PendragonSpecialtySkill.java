package com.wandrell.tabletop.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonSpecialtySkill extends ValueHandler<Integer> {

    @Override
    public PendragonSpecialtySkill createNewInstance();

    public Collection<String> getSurrogatedSkills();

    public Boolean isSkillContained(final String name);

    public void registerSkill(final PendragonSkill skill);

}
