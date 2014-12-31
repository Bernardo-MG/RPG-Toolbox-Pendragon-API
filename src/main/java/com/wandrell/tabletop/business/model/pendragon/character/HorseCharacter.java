package com.wandrell.tabletop.business.model.pendragon.character;

import com.wandrell.tabletop.business.model.valuebox.ValueBox;

public interface HorseCharacter extends PendragonBaseCharacter {

    @Override
    public HorseCharacter createNewInstance();

    public String getHorseType();

    public ValueBox getNaturalArmor();

    public Boolean isArmored();

    public Boolean isCombatHorse();

    public Boolean isHuntingHorse();

    public Boolean isRuined();

    public void setRuined(final Boolean ruined);

}
