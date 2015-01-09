package com.wandrell.tabletop.business.model.pendragon.stats;

import com.wandrell.tabletop.business.model.valuebox.SkillBox;

public interface Skill extends SkillBox {

    @Override
    public Skill createNewInstance();

    public Boolean isCombatSkill();

    public Boolean isCourtlySkill();

    public Boolean isKnightlySkill();

    public Boolean isKnowledgeSkill();

}
