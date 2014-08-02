package com.wandrell.tabletop.pendragon.character.follower;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.util.tag.NewInstantiable;

public interface Child extends NewInstantiable {

    @Override
    public Child createNewInstance();

    public Gender getGender();

    public String getName();

    public Integer getYearBorn();

    public Integer getYearDeath();

}
