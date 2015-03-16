package com.wandrell.tabletop.pendragon.model.chargen;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface CultureTemplate extends NewInstantiable {

    @Override
    public CultureTemplate createNewInstance();

    public FamilyCharacteristicTemplate getFemaleFamilyCharacteristic();

    public AdditionalBelongingsTable getFemaleInitialLuckTable();

    public CultureCharacterTemplate getFemaleTemplate();

    public FamilyCharacteristicTemplate getMaleFamilyCharacteristic();

    public AdditionalBelongingsTable getMaleInitialLuckTable();

    public CultureCharacterTemplate getMaleTemplate();

    public String getName();

}
