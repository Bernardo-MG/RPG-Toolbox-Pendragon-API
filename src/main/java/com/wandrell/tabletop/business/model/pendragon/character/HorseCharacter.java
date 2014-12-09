package com.wandrell.tabletop.business.model.pendragon.character;

import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;

public interface HorseCharacter extends PendragonBaseCharacter {

    @Override
    public HorseCharacter createNewInstance();

    public String getHorseType();

    public ValueHandler getNaturalArmor();

    public Boolean isArmored();

    public Boolean isCombatHorse();

    public Boolean isHuntingHorse();

    public Boolean isRuined();

    public void setRuined(final Boolean ruined);

}
