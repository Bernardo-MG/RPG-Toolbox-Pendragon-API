
package com.wandrell.tabletop.pendragon.model.character.stats;

import java.util.Collection;

public interface SpecialtySkill {

    public String getName();

    public Collection<String> getSurrogatedSkills();

    public Integer getValue();

}
