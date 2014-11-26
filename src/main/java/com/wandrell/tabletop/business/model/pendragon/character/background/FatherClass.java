package com.wandrell.tabletop.business.model.pendragon.character.background;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.pendragon.inventory.Money;

public interface FatherClass {

    public Money getMoney();

    public String getName();

    public Collection<String> getSkillsGroup();

    public Integer getSkillsGroupPoints();

    public Map<String, Integer> getSkillsPoints();

    public Integer getSkillsPoints(final String name);

    public Boolean hasSkillsPoints(final String name);

}
