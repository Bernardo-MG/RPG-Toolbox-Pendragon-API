
package com.wandrell.tabletop.pendragon.model.chargen.background;

import com.wandrell.tabletop.pendragon.model.chargen.inventory.AdditionalBelongingsTable;

public interface CultureTemplate {

    public FamilyCharacteristicTemplate getFemaleFamilyCharacteristic();

    public AdditionalBelongingsTable getFemaleInitialLuckTable();

    public CultureCharacterTemplate getFemaleTemplate();

    public FamilyCharacteristicTemplate getMaleFamilyCharacteristic();

    public AdditionalBelongingsTable getMaleInitialLuckTable();

    public CultureCharacterTemplate getMaleTemplate();

    public String getName();

}
