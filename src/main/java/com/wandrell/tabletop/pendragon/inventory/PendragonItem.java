package com.wandrell.tabletop.pendragon.inventory;

import com.wandrell.tabletop.inventory.ItemData;

public interface PendragonItem extends ItemData {

    @Override
    public PendragonItem createNewInstance();

    public PendragonMoney getMoney();

}
