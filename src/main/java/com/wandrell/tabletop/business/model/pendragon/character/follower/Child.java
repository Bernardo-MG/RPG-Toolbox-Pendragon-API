package com.wandrell.tabletop.business.model.pendragon.character.follower;

import com.wandrell.tabletop.business.model.character.Gender;

public interface Child {

    public Gender getGender();

    public String getName();

    public Integer getYearBorn();

    public Integer getYearDeath();

}
