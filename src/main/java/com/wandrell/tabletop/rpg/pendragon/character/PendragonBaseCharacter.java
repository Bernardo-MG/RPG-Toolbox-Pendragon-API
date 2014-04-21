package com.wandrell.tabletop.rpg.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonDerivedAttribute;

public interface PendragonBaseCharacter {

    public void addDerivedAttribute(
	    final PendragonDerivedAttribute vhDerAttribute);

    public PendragonAttribute getAttribute(final String attribute);

    public Collection<PendragonAttribute> getAttributes();

    public PendragonDerivedAttribute getDerivedAttribute(
	    final String derAttribute);

    public Collection<PendragonDerivedAttribute> getDerivedAttributes();

    public String getName();

    public Boolean hasAttribute(final String name);

    public Boolean hasDerivedAttribute(final String name);

}
