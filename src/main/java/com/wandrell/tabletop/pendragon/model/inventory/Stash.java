package com.wandrell.tabletop.pendragon.model.inventory;

import java.util.Collection;

public interface Stash {

    public void addItem(final Item item);

    public void clearItems();

    public Collection<Item> getItems();

    public Money getMoney();

    public String getName();

    public void removeItem(final Item item);

}
