package com.wandrell.tabletop.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface HorseCharacter extends PendragonBaseCharacter {

    public void addSecondaryAttribute(final ValueHandler attribute);

    @Override
    public HorseCharacter createNewInstance();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public String getHorseType();

    public ValueHandler getSecondaryAttribute(final String name);

    public Collection<ValueHandler> getSecondaryAttributes();

    public Boolean hasFlag(final String name);

    public Boolean hasSecondaryAttribute(final String name);

}
