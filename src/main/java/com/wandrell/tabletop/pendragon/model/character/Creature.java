
package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.tabletop.pendragon.model.character.stats.Skill;
import com.wandrell.tabletop.pendragon.model.character.stats.holder.CharacteristicsHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.holder.CreatureAttributes;
import com.wandrell.tabletop.pendragon.model.character.stats.holder.DerivedAttributes;

public interface Creature {

    public CreatureAttributes getAttributes();

    public DerivedAttributes getDerivedAttributes();

    public CharacteristicsHolder<Skill> getSkills();

}
