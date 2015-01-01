package com.wandrell.tabletop.business.model.pendragon.chargen;

import com.wandrell.tabletop.business.model.interval.IntervalTable;

public interface FamilyCharacteristicTable extends
        IntervalTable<FamilyCharacteristicTemplate> {

    public String getName();

}
