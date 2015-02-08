package com.wandrell.tabletop.business.model.pendragon.character;

public interface Horse extends PendragonBaseCharacter {

    @Override
    public Horse createNewInstance();

    public String getHorseType();

    public Integer getNaturalArmor();

    public Boolean isArmored();

    public Boolean isCombatHorse();

    public Boolean isHuntingHorse();

    public Boolean isRuined();

    public void setRuined(final Boolean ruined);

}
