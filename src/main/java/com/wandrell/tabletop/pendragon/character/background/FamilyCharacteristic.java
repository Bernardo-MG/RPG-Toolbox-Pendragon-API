package com.wandrell.tabletop.pendragon.character.background;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.pendragon.valuehandler.PendragonSkill;
import com.wandrell.util.tag.NewInstantiable;

public interface FamilyCharacteristic extends NewInstantiable {

    @Override
    public FamilyCharacteristic createNewInstance();

    public PendragonAttribute getAttribute(final String name);

    public Collection<PendragonAttribute> getAttributes();

    public String getName();

    public PendragonSkill getSkill(final String name, final String annotation);

    public Collection<PendragonSkill> getSkills();

    public Boolean hasAttribute(final String name);

    public Boolean hasSkill(final String name, final String annotation);

}
