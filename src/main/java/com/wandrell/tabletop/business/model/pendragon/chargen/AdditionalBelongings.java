package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.dice.Dice;
import com.wandrell.tabletop.business.model.pendragon.character.Horse;
import com.wandrell.tabletop.business.model.pendragon.inventory.Item;
import com.wandrell.tabletop.business.model.pendragon.inventory.Money;
import com.wandrell.tabletop.business.model.pendragon.inventory.Shield;
import com.wandrell.tabletop.business.model.pendragon.inventory.Weapon;
import com.wandrell.tabletop.business.model.pendragon.manor.Pet;

public interface AdditionalBelongings {

    public Collection<Horse> getHorses();

    public Collection<Item> getItems();

    public Money getMoney();

    public String getMoneyName();

    public Collection<Pet> getPets();

    public Collection<Dice> getRerolls();

    public String getRerollTable();

    public Collection<Shield> getShields();

    public Collection<Weapon> getWeapons();

    public Boolean hasToChoose();

}
