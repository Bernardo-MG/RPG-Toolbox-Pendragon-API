package com.wandrell.tabletop.business.model.pendragon.character;

import com.wandrell.tabletop.business.model.pendragon.character.background.FamilyCharacteristic;
import com.wandrell.tabletop.business.model.pendragon.character.background.FatherClass;
import com.wandrell.tabletop.business.model.pendragon.character.background.Homeland;
import com.wandrell.tabletop.business.model.pendragon.character.background.culture.Culture;

public interface PendragonChargenCharacter extends PendragonPlayerCharacter {

    // TODO: This maybe can be removed

    @Override
    public PendragonChargenCharacter createNewInstance();

    public void setCulture(final Culture culture);

    public void setFamilyCharacteristic(
            final FamilyCharacteristic characteristic);

    public void setFatherClass(final FatherClass fatherClass);

    public void setHomeland(final Homeland homeland);

}
