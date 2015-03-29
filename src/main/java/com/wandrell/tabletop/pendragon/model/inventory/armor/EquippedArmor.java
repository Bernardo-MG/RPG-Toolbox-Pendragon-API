package com.wandrell.tabletop.pendragon.model.inventory.armor;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;

public interface EquippedArmor extends Prototype {

    public void addArmorPiece(final ArmorPiece armor);

    public void clearArmorPieces();

    @Override
    public EquippedArmor createNewInstance();

    public Collection<ArmorPiece> getArmorPieces();

    public Integer getTotalArmor();

    public void removeArmorPiece(final ArmorPiece armor);

}
