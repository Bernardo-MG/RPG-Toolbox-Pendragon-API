package com.wandrell.tabletop.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonEquipment extends PendragonItem {

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public ValueHandler<Integer> getMiscelanyValue(final String name);

    public Collection<ValueHandler<Integer>> getMiscelanyValues();

    public Boolean hasFlag(final String name);

    public Boolean hasValue(final String name);

}
