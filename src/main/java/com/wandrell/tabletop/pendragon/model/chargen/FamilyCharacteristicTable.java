package com.wandrell.tabletop.pendragon.model.chargen;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.interval.IntervalTable;

public interface FamilyCharacteristicTable extends
        IntervalTable<FamilyCharacteristicTemplate>, NewInstantiable {

    @Override
    public FamilyCharacteristicTable createNewInstance();

    public String getName();

}
