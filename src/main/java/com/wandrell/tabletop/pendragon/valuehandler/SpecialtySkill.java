package com.wandrell.tabletop.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface SpecialtySkill extends ValueHandler {

    @Override
    public SpecialtySkill createNewInstance();

    public Collection<String> getSurrogatedSkills();

    public Boolean isSkillContained(final String name);

    public void registerSkill(final Skill skill);

}
