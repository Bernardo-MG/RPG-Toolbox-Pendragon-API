package com.wandrell.tabletop.pendragon.model.inventory.weapon;

public interface RangedWeapon extends Weapon {

    @Override
    public RangedWeapon createNewInstance();

    public Integer getMaxRange();

    public Integer getRoundsToReload();

}
