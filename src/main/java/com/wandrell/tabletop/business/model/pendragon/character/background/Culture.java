package com.wandrell.tabletop.business.model.pendragon.character.background;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.dice.RollTable;
import com.wandrell.tabletop.business.model.pendragon.inventory.AdditionalBelongings;

public interface Culture {

    public FamilyCharacteristic getFamilyCharacteristic(final Gender gender);

    public RollTable<AdditionalBelongings> getInitialLuckTable(
            final Gender gender);

    public String getName();

    public CultureCharacterTemplate getRandomTemplate(final Gender gender);

    public CultureCharacterTemplate getTemplate(final Gender gender);

}
