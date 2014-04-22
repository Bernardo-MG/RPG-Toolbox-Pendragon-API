package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import com.wandrell.tabletop.rpg.valuehandler.Annotated;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonAppearanceFeature extends ValueHandler<Integer>,
	Annotated {

    @Override
    public PendragonAppearanceFeature createNewInstance();

}
