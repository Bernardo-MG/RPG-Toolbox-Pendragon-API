
package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface PendragonSkillBox extends SkillBox {

    public Boolean isCombatSkill();

    public Boolean isCourtlySkill();

    public Boolean isKnightlySkill();

    public Boolean isKnowledgeSkill();

}
