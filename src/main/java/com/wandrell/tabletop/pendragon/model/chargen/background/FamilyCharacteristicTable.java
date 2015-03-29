package com.wandrell.tabletop.pendragon.model.chargen.background;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.interval.IntervalTable;

public interface FamilyCharacteristicTable extends
        IntervalTable<FamilyCharacteristicTemplate>, Prototype {

    @Override
    public FamilyCharacteristicTable createNewInstance();

    public String getName();

}
