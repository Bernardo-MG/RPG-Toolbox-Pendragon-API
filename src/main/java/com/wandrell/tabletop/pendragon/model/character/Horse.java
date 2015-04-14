package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.pattern.prototype.Prototype;

public interface Horse extends Prototype, PendragonCharacter {

    @Override
    public Horse createNewInstance();

    public String getHorseType();

    public Integer getNaturalArmor();

    /**
     * TODO: What is this armored flag for?
     * 
     * @return
     */
    public Boolean isArmored();

    public Boolean isCombatHorse();

    public Boolean isHuntingHorse();

    public Boolean isRuined();

    public void setArmoredHorse(final Boolean armored);

    public void setCombatHorse(final Boolean combat);

    public void setHuntingHorse(final Boolean hunting);

    public void setRuined(final Boolean ruined);

}
