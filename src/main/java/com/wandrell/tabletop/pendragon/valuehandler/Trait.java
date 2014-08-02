package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface Trait extends ValueHandler<Integer> {

    @Override
    public Trait createNewInstance();

    public Trait getMirrorTrait();

    public Boolean isGoodTrait();

}
