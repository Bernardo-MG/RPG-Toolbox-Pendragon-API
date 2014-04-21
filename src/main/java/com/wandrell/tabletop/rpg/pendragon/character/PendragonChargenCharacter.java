package com.wandrell.tabletop.rpg.pendragon.character;

import com.wandrell.tabletop.rpg.dice.RollTable;
import com.wandrell.tabletop.rpg.pendragon.character.background.FamilyCharacteristic;
import com.wandrell.tabletop.rpg.pendragon.character.background.FatherClass;
import com.wandrell.tabletop.rpg.pendragon.character.background.Homeland;
import com.wandrell.tabletop.rpg.pendragon.character.background.culture.Culture;
import com.wandrell.tabletop.rpg.pendragon.inventory.AdditionalBelongingsSetData;

public interface PendragonChargenCharacter extends PendragonPlayerCharacter {

    public Culture getCultureData();

    public FatherClass getFatherClassData();

    public Homeland getHomelandData();

    public RollTable<AdditionalBelongingsSetData> getInitialLuckTable();

    public boolean isKnightChosen();

    public void setCultureData(final Culture culture);

    public void setFamilyCharacteristic(final FamilyCharacteristic familyChar);

    public void setFatherClassData(final FatherClass fatherClassTemplate);

    public void setHomelandData(final Homeland homeland);

}
