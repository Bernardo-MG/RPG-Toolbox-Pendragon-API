package com.wandrell.tabletop.pendragon.model.inventory.armor;

import java.util.Collection;

public interface EquippedArmor {

    public void addArmorPiece(final ArmorPiece armor);

    public void clearArmorPieces();

    public Collection<ArmorPiece> getArmorPieces();

    public Integer getTotalArmor();

    public void removeArmorPiece(final ArmorPiece armor);

}
