package com.wandrell.tabletop.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface AdditionalBelongings extends NewInstantiable {

    @Override
    public AdditionalBelongings createNewInstance();

    public Collection<String> getEquipableItemsFiles();

    public Collection<String> getHorsesFiles();

    public PendragonMoney getMoney();

    public String getMoneyName();

    public Collection<String> getPetsFiles();

    public Collection<ValueHandler<Integer>> getRerolls();

    public Collection<String> getShieldsFiles();

    public String getTableFile();

    public Collection<String> getWeaponsFiles();

    public Boolean hasToChoose();

}
