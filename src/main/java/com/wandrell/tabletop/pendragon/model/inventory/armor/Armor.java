package com.wandrell.tabletop.pendragon.model.inventory.armor;

import com.wandrell.tabletop.pendragon.model.inventory.Item;

public interface Armor extends Item, ArmorPiece {

    @Override
    public Armor createNewInstance();

    public ArmorType getArmorType();

    public Integer getDexterityModifier();

    public Boolean isHeavyLoad();

}
