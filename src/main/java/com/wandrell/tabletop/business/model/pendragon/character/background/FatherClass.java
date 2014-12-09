package com.wandrell.tabletop.business.model.pendragon.character.background;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Money;

public interface FatherClass {

    public Money getMoney();

    public String getName();

    public Integer getNonCombatSkillsPoints();

    public Collection<String> getSkillsGroup();

    public Integer getSkillsGroupPoints();

    public Integer getSkillsPoints();

}
