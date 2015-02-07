package com.wandrell.tabletop.business.model.pendragon.chargen;

public interface CultureTemplate {

    public FamilyCharacteristicTemplate getFemaleFamilyCharacteristic();

    public AdditionalBelongingsTable getFemaleInitialLuckTable();

    public CultureCharacterTemplate getFemaleTemplate();

    public FamilyCharacteristicTemplate getMaleFamilyCharacteristic();

    public AdditionalBelongingsTable getMaleInitialLuckTable();

    public CultureCharacterTemplate getMaleTemplate();

    public String getName();

}
