package com.wandrell.tabletop.business.model.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Money;

public interface FatherClassTemplate {

    public String getFatherClass();

    public Money getMoney();

    public Integer getNonCombatSkillsPoints();

    public Collection<String> getSkillsGroup();

    public Integer getSkillsGroupPoints();

    public Integer getSkillsPoints();

}
