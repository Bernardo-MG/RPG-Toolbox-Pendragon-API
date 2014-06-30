package com.wandrell.tabletop.rpg.pendragon.inventory;

public interface WeaponEquipment extends PendragonEquipment {

    @Override
    public WeaponEquipment createNewInstance();

    public String getSkill();

    public Boolean isDamageOverriden();

    public void setSkill(final String skill);

}
