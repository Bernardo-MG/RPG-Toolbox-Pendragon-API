package com.wandrell.tabletop.pendragon.model.stats;

import com.wandrell.tabletop.valuebox.SkillBox;

public interface Skill extends SkillBox {

    @Override
    public Skill createNewInstance();

    public Boolean isCombatSkill();

    public Boolean isCourtlySkill();

    public Boolean isKnightlySkill();

    public Boolean isKnowledgeSkill();

}
