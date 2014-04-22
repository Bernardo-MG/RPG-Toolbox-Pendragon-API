package com.wandrell.tabletop.rpg.pendragon.valuehandler;

import com.wandrell.tabletop.rpg.valuehandler.Annotated;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonSkill extends ValueHandler<Integer>, Annotated {

    @Override
    public PendragonSkill createNewInstance();

    public boolean isCombatSkill();

    public boolean isCourtlySkill();

    public boolean isKnightlySkill();

    public boolean isKnowledgeSkill();

    public boolean isRepeteable();

}
