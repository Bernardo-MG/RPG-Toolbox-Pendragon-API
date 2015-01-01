package com.wandrell.tabletop.business.model.pendragon.chargen;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.interval.IntervalTable;

public interface CultureTemplate {

    public String getCulture();

    public FamilyCharacteristicTemplate getFamilyCharacteristic(
            final Gender gender);

    public IntervalTable<AdditionalBelongings> getInitialLuckTable(
            final Gender gender);

    public CultureCharacterTemplate getRandomTemplate(final Gender gender);

    public CultureCharacterTemplate getTemplate(final Gender gender);

}
