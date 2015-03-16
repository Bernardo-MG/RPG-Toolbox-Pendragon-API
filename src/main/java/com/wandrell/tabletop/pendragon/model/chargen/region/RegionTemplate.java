package com.wandrell.tabletop.pendragon.model.chargen.region;

import java.util.Map;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface RegionTemplate extends NewInstantiable {

    @Override
    public RegionTemplate createNewInstance();

    public String getName();

    public Map<String, Integer> getTraits();

}
