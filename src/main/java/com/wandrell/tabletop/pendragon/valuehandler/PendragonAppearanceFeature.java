package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.Annotated;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonAppearanceFeature extends ValueHandler<Integer>,
	Annotated {

    @Override
    public PendragonAppearanceFeature createNewInstance();

}
