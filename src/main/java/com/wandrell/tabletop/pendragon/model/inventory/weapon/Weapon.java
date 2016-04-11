
package com.wandrell.tabletop.pendragon.model.inventory.weapon;

import java.util.Map;

import com.wandrell.tabletop.pendragon.model.inventory.Item;
import com.wandrell.tabletop.pendragon.model.inventory.armor.ArmorType;

public interface Weapon extends Item {

    /**
     * Returns a map indicating the number of dice to be added or removed when
     * using the weapon against a type of armor.
     * 
     * @return a map indicating the dice bonus against armors
     */
    public Map<ArmorType, Integer> getArmorBonusDice();

    /**
     * Returns the value to be added or removed on the damage roll.
     * 
     * @return the bonus to the damage dice result
     */
    public Integer getDamageBonus();

    /**
     * Returns the number of dice to be added or removed on the damage roll.
     * 
     * @return the bonus to the damage dice number
     */
    public Integer getDamageDiceBonus();

    /**
     * Used when the weapon does it's own damage, and not the user's.
     * 
     * @return the dice for the damage
     */
    public Integer getDamageOverrideDice();

    public String getSkill();

    public Boolean isBreakingEnemyOnDraw();

    public Boolean isBreakingOnFumble();

    public Boolean isHittingBack();

    public Boolean isIgnoringShield();

    public Boolean isReducingShieldToRoll();

    public Boolean isTwoHanded();

}
