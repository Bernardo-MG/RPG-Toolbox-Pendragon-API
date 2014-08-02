package com.wandrell.tabletop.pendragon.character.background;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.Attribute;
import com.wandrell.tabletop.pendragon.valuehandler.Skill;

public interface FamilyCharacteristic {

    public Attribute getAttribute(final String name);

    public Collection<Attribute> getAttributes();

    public String getName();

    public Skill getSkill(final String name, final String annotation);

    public Collection<Skill> getSkills();

    public Boolean hasAttribute(final String name);

    public Boolean hasSkill(final String name, final String annotation);

}
