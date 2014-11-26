package com.wandrell.tabletop.business.model.pendragon.character.module;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface TraitsBonusSwitchsData extends NewInstantiable {

    @Override
    public TraitsBonusSwitchsData createNewInstance();

    public EditableValueHandler getBonusSwitch(final String name);

    public Boolean hasBonusSwitch(final String name);

}
