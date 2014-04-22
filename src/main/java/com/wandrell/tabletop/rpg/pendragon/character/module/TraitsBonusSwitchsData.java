package com.wandrell.tabletop.rpg.pendragon.character.module;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface TraitsBonusSwitchsData extends NewInstantiable {

    @Override
    public TraitsBonusSwitchsData createNewInstance();

    public ValueHandler<Integer> getBonusSwitch(final String name);

    public Collection<ValueHandler<Integer>> getBonusSwitchs();

    public Boolean hasBonusSwitch(final String name);

}
