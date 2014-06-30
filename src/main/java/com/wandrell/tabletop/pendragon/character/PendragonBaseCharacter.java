package com.wandrell.tabletop.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.PendragonAttribute;
import com.wandrell.tabletop.pendragon.valuehandler.PendragonDerivedAttribute;
import com.wandrell.util.tag.NewInstantiable;

public interface PendragonBaseCharacter extends NewInstantiable {

    public void addDerivedAttribute(final PendragonDerivedAttribute attribute);

    @Override
    public PendragonBaseCharacter createNewInstance();

    public PendragonAttribute getAttribute(final String attribute);

    public Collection<PendragonAttribute> getAttributes();

    public PendragonDerivedAttribute getDerivedAttribute(final String name);

    public Collection<PendragonDerivedAttribute> getDerivedAttributes();

    public String getName();

    public Boolean hasAttribute(final String name);

    public Boolean hasDerivedAttribute(final String name);

}
