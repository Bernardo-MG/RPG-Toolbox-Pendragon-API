package com.wandrell.tabletop.pendragon.model.inventory;

public interface Armor extends Item {

    public ArmorType getArmorType();

    public Integer getArmorValue();

    public Integer getDexterityModifier();

    public Boolean isHeavyLoad();

}
