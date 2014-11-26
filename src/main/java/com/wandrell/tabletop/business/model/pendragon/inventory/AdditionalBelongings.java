package com.wandrell.tabletop.business.model.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.dice.Dice;

public interface AdditionalBelongings {

    public Collection<String> getEquipableItemsFiles();

    public Collection<String> getHorsesFiles();

    public Money getMoney();

    public String getMoneyName();

    public Collection<String> getPetsFiles();

    public Collection<Dice> getRerolls();

    public Collection<String> getShieldsFiles();

    public String getTableFile();

    public Collection<String> getWeaponsFiles();

    public Boolean hasToChoose();

}
