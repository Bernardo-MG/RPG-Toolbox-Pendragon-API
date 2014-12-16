package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.dice.Dice;
import com.wandrell.tabletop.business.model.interval.IntervalTable;
import com.wandrell.tabletop.business.model.pendragon.character.HorseCharacter;
import com.wandrell.tabletop.business.model.pendragon.inventory.Equipment;
import com.wandrell.tabletop.business.model.pendragon.inventory.Money;
import com.wandrell.tabletop.business.model.pendragon.inventory.Shield;
import com.wandrell.tabletop.business.model.pendragon.inventory.Weapon;
import com.wandrell.tabletop.business.model.pendragon.manor.Pet;

public interface AdditionalBelongings {

    public Collection<Equipment> getEquipment();

    public Collection<HorseCharacter> getHorses();

    public Money getMoney();

    public String getMoneyName();

    public Collection<Pet> getPets();

    public Collection<Dice> getRerolls();

    public Collection<Shield> getShields();

    public IntervalTable<?> getTable();

    public Collection<Weapon> getWeapons();

    public Boolean hasToChoose();

}
