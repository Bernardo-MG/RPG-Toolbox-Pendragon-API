package com.wandrell.tabletop.rpg.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface AdditionalBelongingsSetData {

    public Collection<String> getEquipableItemsFiles();

    public Collection<String> getHorsesFiles();

    public PendragonMoneyData getMoneyData();

    public String getMoneyName();

    public Collection<String> getPetsFiles();

    public Collection<ValueHandler<Integer>> getRerolls();

    public Collection<String> getShieldsFiles();

    public String getTableFile();

    public Collection<String> getWeaponsFiles();

    public Boolean hasToChoose();

}
