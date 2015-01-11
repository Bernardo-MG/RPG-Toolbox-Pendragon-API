package com.wandrell.tabletop.business.model.pendragon.inventory;

public interface Armor extends Item {

    public ArmorType getArmorType();

    public Integer getArmorValue();

    public Integer getDexterityModifier();

    public Boolean isHeavyLoad();

}
