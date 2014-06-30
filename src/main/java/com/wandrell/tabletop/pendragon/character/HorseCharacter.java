package com.wandrell.tabletop.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface HorseCharacter extends PendragonBaseCharacter {

    public void addSecondaryAttribute(final ValueHandler<Integer> vhSecAttribute);

    @Override
    public HorseCharacter createNewInstance();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public String getHorseType();

    public ValueHandler<Integer> getSecondaryAttribute(final String name);

    public Collection<ValueHandler<Integer>> getSecondaryAttributes();

    public Boolean hasFlag(final String name);

    public Boolean hasSecondaryAttribute(final String name);

}
