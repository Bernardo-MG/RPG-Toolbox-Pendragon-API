package com.wandrell.tabletop.business.model.pendragon.stats;

import com.wandrell.tabletop.business.model.valuebox.SkillBox;

public interface DirectedTrait extends SkillBox {

    @Override
    public DirectedTrait createNewInstance();

    public Trait getTrait();

}
