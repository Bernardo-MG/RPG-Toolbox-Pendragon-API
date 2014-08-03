package com.wandrell.tabletop.pendragon.inventory;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Money extends NewInstantiable {

    @Override
    public Money createNewInstance();

    public ValueHandler<Integer> getDenarii();

    public ValueHandler<Integer> getLibra();

}
