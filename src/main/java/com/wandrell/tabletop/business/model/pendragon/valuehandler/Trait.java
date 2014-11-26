package com.wandrell.tabletop.business.model.pendragon.valuehandler;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface Trait extends EditableValueHandler {

    @Override
    public Trait createNewInstance();

    public Trait getMirrorTrait();

    public Boolean isGoodTrait();

}
