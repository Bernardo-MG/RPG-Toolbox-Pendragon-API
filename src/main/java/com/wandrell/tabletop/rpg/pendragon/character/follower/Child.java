package com.wandrell.tabletop.rpg.pendragon.character.follower;

import com.wandrell.tabletop.rpg.character.Gender;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Child extends NewInstantiable {

    @Override
    public Child createNewInstance();

    public Gender getGender();

    public String getName();

    public ValueHandler<Integer> getYearBorn();

    public ValueHandler<Integer> getYearDeath();

}
