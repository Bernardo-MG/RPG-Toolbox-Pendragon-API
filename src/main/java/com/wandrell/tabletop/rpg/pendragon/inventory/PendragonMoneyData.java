package com.wandrell.tabletop.rpg.pendragon.inventory;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonMoneyData {

    public ValueHandler<Integer> getDenariiValueHandler();

    public ValueHandler<Integer> getLibraValueHandler();

}
