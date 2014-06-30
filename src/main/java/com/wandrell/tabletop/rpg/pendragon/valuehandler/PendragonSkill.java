package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import com.wandrell.tabletop.rpg.valuehandler.Annotated;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonSkill extends ValueHandler<Integer>, Annotated {

    @Override
    public PendragonSkill createNewInstance();

    public Boolean isCombatSkill();

    public Boolean isCourtlySkill();

    public Boolean isKnightlySkill();

    public Boolean isKnowledgeSkill();

    public Boolean isRepeteable();

}
