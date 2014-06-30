package com.wandrell.tabletop.rpg.pendragon.character;

import com.wandrell.tabletop.rpg.pendragon.character.background.FamilyCharacteristic;
import com.wandrell.tabletop.rpg.pendragon.character.background.FatherClass;
import com.wandrell.tabletop.rpg.pendragon.character.background.Homeland;
import com.wandrell.tabletop.rpg.pendragon.character.background.culture.Culture;

public interface PendragonChargenCharacter extends PendragonPlayerCharacter {

    @Override
    public PendragonChargenCharacter createNewInstance();

    public Culture getCulture();

    public FatherClass getFatherClass();

    public Homeland getHomeland();

    public Boolean isKnightChosen();

    public void setCulture(final Culture culture);

    public void setFamilyCharacteristic(
	    final FamilyCharacteristic characteristic);

    public void setFatherClassData(final FatherClass fatherClass);

    public void setHomelandData(final Homeland homeland);

}
