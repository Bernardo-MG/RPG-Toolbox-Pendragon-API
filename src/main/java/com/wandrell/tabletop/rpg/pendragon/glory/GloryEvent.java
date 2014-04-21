package com.wandrell.tabletop.rpg.pendragon.glory;

import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface GloryEvent {

    public ValueHandler<Integer> getGloryGained();

    public String getInfo();

    public ValueHandler<Integer> getYear();

}
