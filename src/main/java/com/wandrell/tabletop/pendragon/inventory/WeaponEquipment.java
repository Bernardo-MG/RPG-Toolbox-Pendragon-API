package com.wandrell.tabletop.pendragon.inventory;

public interface WeaponEquipment extends PendragonEquipment {

    @Override
    public WeaponEquipment createNewInstance();

    public String getSkill();

    public Boolean isDamageOverriden();

}
