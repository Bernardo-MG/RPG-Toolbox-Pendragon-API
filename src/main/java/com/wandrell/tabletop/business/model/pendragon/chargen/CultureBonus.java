package com.wandrell.tabletop.business.model.pendragon.chargen;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.interval.IntervalTable;

public interface CultureBonus {

    public String getCulture();

    public FamilyCharacteristicBonus
            getFamilyCharacteristic(final Gender gender);

    public IntervalTable<AdditionalBelongings> getInitialLuckTable(
            final Gender gender);

    public CultureCharacterTemplate getRandomTemplate(final Gender gender);

    public CultureCharacterTemplate getTemplate(final Gender gender);

}
