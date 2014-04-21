package com.wandrell.tabletop.rpg.pendragon.character.follower;

import com.wandrell.tabletop.rpg.character.Gender;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface Child {

    public Gender getGender();

    public String getName();

    public ValueHandler<Integer> getYearBorn();

    public ValueHandler<Integer> getYearDeath();

}
