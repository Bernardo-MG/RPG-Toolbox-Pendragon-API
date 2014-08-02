package com.wandrell.tabletop.pendragon.character.module;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface TraitsBonusSwitchsData extends NewInstantiable {

    @Override
    public TraitsBonusSwitchsData createNewInstance();

    public ValueHandler<Integer> getBonusSwitch(final String name);

    public Boolean hasBonusSwitch(final String name);

}
