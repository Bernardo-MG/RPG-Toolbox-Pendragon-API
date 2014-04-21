package com.wandrell.tabletop.rpg.pendragon.character.background;

import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSkill;

public interface FamilyCharacteristic {
    
    public String getName();

    public PendragonAttribute getAttribute(final String name);

    public Collection<PendragonAttribute> getAttributes();

    public PendragonSkill getSkill(final String name, final String annotation);

    public Collection<PendragonSkill> getSkills();

    public boolean hasAttribute(final String name);

    public boolean hasSkill(final String name, final String annotation);

}
