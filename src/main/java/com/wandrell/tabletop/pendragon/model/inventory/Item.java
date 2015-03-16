package com.wandrell.tabletop.pendragon.model.inventory;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface Item extends NewInstantiable {

    @Override
    public Item createNewInstance();

    public String getDescription();

    public Money getMoney();

    public String getName();

}
