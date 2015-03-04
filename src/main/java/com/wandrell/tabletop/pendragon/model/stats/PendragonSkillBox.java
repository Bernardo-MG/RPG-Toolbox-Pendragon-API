package com.wandrell.tabletop.pendragon.model.stats;

import com.wandrell.tabletop.valuebox.SkillBox;

public interface PendragonSkillBox extends SkillBox {

    @Override
    public PendragonSkillBox createNewInstance();

    public Boolean isCombatSkill();

    public Boolean isCourtlySkill();

    public Boolean isKnightlySkill();

    public Boolean isKnowledgeSkill();

}
