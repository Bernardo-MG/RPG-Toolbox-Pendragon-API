package com.wandrell.tabletop.pendragon.model.character.relationship;

import java.util.Collection;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface Wife extends NewInstantiable {

    @Override
    public Wife createNewInstance();

    public Collection<Child> getChildren();

    public String getName();

    public Integer getYearWed();

}
