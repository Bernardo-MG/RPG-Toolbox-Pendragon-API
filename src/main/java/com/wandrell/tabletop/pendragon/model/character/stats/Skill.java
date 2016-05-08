
package com.wandrell.tabletop.pendragon.model.character.stats;

public interface Skill {

    public String getName();

    public Integer getValue();

    public Boolean isCombatSkill();

    public Boolean isCourtlySkill();

    public Boolean isKnightlySkill();

    public Boolean isKnowledgeSkill();

}
