package com.wandrell.tabletop.pendragon.model.inventory;

public interface Armor extends Item, ArmorPiece {

    public ArmorType getArmorType();

    public Integer getDexterityModifier();

    public Boolean isHeavyLoad();

}
