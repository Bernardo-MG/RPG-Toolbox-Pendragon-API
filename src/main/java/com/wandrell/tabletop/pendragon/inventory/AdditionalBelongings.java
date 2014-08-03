package com.wandrell.tabletop.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.dice.Dice;

public interface AdditionalBelongings {

    public Collection<String> getEquipableItemsFiles();

    public Collection<String> getHorsesFiles();

    public PendragonMoney getMoney();

    public String getMoneyName();

    public Collection<String> getPetsFiles();

    public Collection<Dice> getRerolls();

    public Collection<String> getShieldsFiles();

    public String getTableFile();

    public Collection<String> getWeaponsFiles();

    public Boolean hasToChoose();

}
