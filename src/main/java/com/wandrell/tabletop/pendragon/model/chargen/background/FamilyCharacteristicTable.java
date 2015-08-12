package com.wandrell.tabletop.pendragon.model.chargen.background;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.interval.table.IntervalsTable;

public interface FamilyCharacteristicTable
        extends IntervalsTable<FamilyCharacteristicTemplate>, Prototype {

    @Override
    public FamilyCharacteristicTable createNewInstance();

    public String getName();

}
