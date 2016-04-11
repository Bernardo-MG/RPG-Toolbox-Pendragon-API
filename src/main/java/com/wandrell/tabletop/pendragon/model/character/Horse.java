
package com.wandrell.tabletop.pendragon.model.character;

public interface Horse extends PendragonCharacter {

    public String getHorseType();

    public Integer getNaturalArmor();

    /**
     * TODO: What is this armored flag for?
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
