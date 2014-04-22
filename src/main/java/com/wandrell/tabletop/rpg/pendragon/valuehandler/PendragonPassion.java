package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import com.wandrell.tabletop.rpg.valuehandler.Annotated;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonPassion extends ValueHandler<Integer>, Annotated {

    @Override
    public PendragonPassion createNewInstance();

}
