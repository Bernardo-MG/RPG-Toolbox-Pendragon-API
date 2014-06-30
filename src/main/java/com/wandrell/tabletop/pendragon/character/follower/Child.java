package com.wandrell.tabletop.pendragon.character.follower;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Child extends NewInstantiable {

    @Override
    public Child createNewInstance();

    public Gender getGender();

    public String getName();

    public ValueHandler<Integer> getYearBorn();

    public ValueHandler<Integer> getYearDeath();

}
