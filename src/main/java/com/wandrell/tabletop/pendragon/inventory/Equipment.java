package com.wandrell.tabletop.pendragon.inventory;

import java.util.Collection;
import java.util.Map;

public interface Equipment extends Item {

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public Map<String, Integer> getMiscelanyValues();

    public Boolean hasFlag(final String name);

}
