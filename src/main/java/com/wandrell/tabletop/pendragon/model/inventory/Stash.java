package com.wandrell.tabletop.pendragon.model.inventory;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;

public interface Stash extends Prototype {

    public void addItem(final Item item);

    public void clearItems();

    @Override
    public Stash createNewInstance();

    public Collection<Item> getItems();

    public Money getMoney();

    public String getName();

    public void removeItem(final Item item);

}
