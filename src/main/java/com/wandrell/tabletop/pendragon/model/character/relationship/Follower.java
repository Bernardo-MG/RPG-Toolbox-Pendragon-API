package com.wandrell.tabletop.pendragon.model.character.relationship;

import com.wandrell.pattern.prototype.Prototype;

public interface Follower extends Prototype {

    @Override
    public Follower createNewInstance();

    public String getJob();

    public String getName();

}
