package com.wandrell.tabletop.business.model.pendragon.stats;

import com.wandrell.tabletop.business.model.valuebox.EditableValueBox;

public interface Trait extends EditableValueBox {

    @Override
    public Trait createNewInstance();

    public Trait getMirrorTrait();

    public Boolean isGoodTrait();

}
