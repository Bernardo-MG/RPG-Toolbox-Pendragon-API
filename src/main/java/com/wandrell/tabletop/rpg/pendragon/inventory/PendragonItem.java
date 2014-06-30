package com.wandrell.tabletop.rpg.pendragon.inventory;

import com.wandrell.tabletop.rpg.inventory.ItemData;

public interface PendragonItem extends ItemData {

    @Override
    public PendragonItem createNewInstance();

    public PendragonMoney getMoney();

}
