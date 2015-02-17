package com.wandrell.tabletop.pendragon.model.chargen;

import com.wandrell.tabletop.interval.IntervalTable;

public interface FamilyCharacteristicTable extends
        IntervalTable<FamilyCharacteristicTemplate> {

    public String getName();

}
