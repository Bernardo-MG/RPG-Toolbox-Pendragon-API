package com.wandrell.tabletop.pendragon.model.character.relationship;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface Follower extends NewInstantiable {

    @Override
    public Follower createNewInstance();

    public String getJob();

    public String getName();

}
