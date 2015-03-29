package com.wandrell.tabletop.pendragon.model.inventory;

import com.wandrell.pattern.prototype.Prototype;

public interface Item extends Prototype {

    @Override
    public Item createNewInstance();

    public String getDescription();

    public Money getMoney();

    public String getName();

}
