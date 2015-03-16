package com.wandrell.tabletop.pendragon.model.inventory.armor;

import com.wandrell.tabletop.pendragon.model.inventory.Item;

public interface Shield extends Item {

    @Override
    public Shield createNewInstance();

    public Integer getArmorValue();

}
