
package com.wandrell.tabletop.pendragon.model.chargen.inventory;

import java.util.Collection;

import com.wandrell.tabletop.dice.notation.DiceNotationExpression;
import com.wandrell.tabletop.pendragon.model.character.Horse;
import com.wandrell.tabletop.pendragon.model.inventory.Item;
import com.wandrell.tabletop.pendragon.model.inventory.Money;
import com.wandrell.tabletop.pendragon.model.inventory.armor.Shield;
import com.wandrell.tabletop.pendragon.model.inventory.weapon.Weapon;
import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface AdditionalBelongings {

    public Collection<Horse> getHorses();

    public Collection<Item> getItems();

    public Money getMoney();

    public String getMoneyName();

    public Collection<Pet> getPets();

    public Collection<DiceNotationExpression> getRerolls();

    public String getRerollTable();

    public Collection<Shield> getShields();

    public Collection<Weapon> getWeapons();

    public Boolean hasToChoose();

}
