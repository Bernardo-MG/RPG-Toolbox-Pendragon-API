package com.wandrell.tabletop.pendragon.valuehandler;

import com.wandrell.tabletop.valuehandler.Annotated;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonSkill extends ValueHandler<Integer>, Annotated {

    @Override
    public PendragonSkill createNewInstance();

    public Boolean isCombatSkill();

    public Boolean isCourtlySkill();

    public Boolean isKnightlySkill();

    public Boolean isKnowledgeSkill();

    public Boolean isRepeteable();

}
