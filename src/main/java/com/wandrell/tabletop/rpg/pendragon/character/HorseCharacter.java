package com.wandrell.tabletop.rpg.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface HorseCharacter extends PendragonBaseCharacter {

    public void addSecondaryAttribute(final ValueHandler<Integer> vhSecAttribute);

    public Boolean getFlag(final String flag);

    public Collection<String> getFlags();

    public String getHorseType();

    public ValueHandler<Integer> getSecondaryAttribute(final String secAttribute);

    public Collection<ValueHandler<Integer>> getSecondaryAttributes();

    public Boolean hasFlag(final String flag);

    public Boolean hasSecondaryAttribute(final String secAttribute);

}
