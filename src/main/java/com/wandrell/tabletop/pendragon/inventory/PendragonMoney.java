package com.wandrell.tabletop.pendragon.inventory;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface PendragonMoney extends NewInstantiable {

    @Override
    public PendragonMoney createNewInstance();

    public ValueHandler<Integer> getDenarii();

    public ValueHandler<Integer> getLibra();

}
