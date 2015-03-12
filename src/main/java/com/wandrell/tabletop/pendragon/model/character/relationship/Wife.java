package com.wandrell.tabletop.pendragon.model.character.relationship;

import java.util.Collection;

public interface Wife {

    public Collection<Child> getChildren();

    public String getName();

    public Integer getYearWed();

}
