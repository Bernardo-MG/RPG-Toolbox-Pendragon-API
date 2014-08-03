package com.wandrell.tabletop.pendragon.character.background;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.pendragon.inventory.PendragonMoney;

public interface FatherClass {

    public PendragonMoney getMoney();

    public String getName();

    public Collection<String> getSkillsGroup();

    public Integer getSkillsGroupPoints();

    public Map<String, Integer> getSkillsPoints();

    public Integer getSkillsPoints(final String name);

    public Boolean hasSkillsPoints(final String name);

}
