package com.wandrell.tabletop.rpg.pendragon.inventory;

public interface WeaponEquipment extends PendragonEquipment {

    public String getSkill();

    public boolean isDamageOverriden();

    public void setSkill(final String skill);

}
