package com.wandrell.tabletop.pendragon.model.chargen.region;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.pendragon.model.character.stats.TraitsHolder;

public interface RegionTemplate extends Prototype {

    @Override
    public RegionTemplate createNewInstance();

    public String getName();

    public TraitsHolder getTraits();

}
