package com.wandrell.tabletop.business.model.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface HorseCharacter extends PendragonBaseCharacter {

    public void addSecondaryAttribute(final EditableValueHandler attribute);

    @Override
    public HorseCharacter createNewInstance();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public String getHorseType();

    public EditableValueHandler getSecondaryAttribute(final String name);

    public Collection<EditableValueHandler> getSecondaryAttributes();

    public Boolean hasFlag(final String name);

    public Boolean hasSecondaryAttribute(final String name);

}
