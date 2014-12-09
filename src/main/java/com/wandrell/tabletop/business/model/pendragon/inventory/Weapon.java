package com.wandrell.tabletop.business.model.pendragon.inventory;

import com.wandrell.tabletop.business.model.dice.Dice;

public interface Weapon extends Equipment {

    public Integer getDamageBonus();

    public Dice getDamageOverridenDice();

    public String getSkill();

    public Boolean isBreakingEnemyOnDraw();

    public Boolean isBreakingOnFumble();

    public Boolean isDamageOverriden();

    public Boolean isHittingBack();

    public Boolean isIgnoringShield();

    public Boolean isReducingShieldToRoll();

    public Boolean isTwoHanded();

}
