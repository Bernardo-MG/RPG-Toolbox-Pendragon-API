package com.wandrell.tabletop.rpg.pendragon.inventory;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface PendragonMoneyData extends NewInstantiable {

    @Override
    public PendragonMoneyData createNewInstance();

    public ValueHandler<Integer> getDenariiValueHandler();

    public ValueHandler<Integer> getLibraValueHandler();

}
