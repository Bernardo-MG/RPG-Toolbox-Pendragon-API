package com.wandrell.tabletop.business.model.pendragon.character.background;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.interval.IntervalTable;
import com.wandrell.tabletop.business.model.pendragon.inventory.AdditionalBelongings;

public interface Culture {

    public FamilyCharacteristic getFamilyCharacteristic(final Gender gender);

    public IntervalTable<AdditionalBelongings> getInitialLuckTable(
            final Gender gender);

    public String getName();

    public CultureCharacterTemplate getRandomTemplate(final Gender gender);

    public CultureCharacterTemplate getTemplate(final Gender gender);

}
