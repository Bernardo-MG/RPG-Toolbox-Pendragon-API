
package com.wandrell.tabletop.pendragon.model.character.stats;

import java.util.Collection;

public interface SpecialtySkill {

    public String getName();

    public Collection<Skill> getSurrogatedSkills();

    public Integer getValue();

}
