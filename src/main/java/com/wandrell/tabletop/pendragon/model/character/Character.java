
package com.wandrell.tabletop.pendragon.model.character;

import com.wandrell.tabletop.pendragon.model.character.background.BackgroundInfo;
import com.wandrell.tabletop.pendragon.model.character.stats.DirectedTrait;
import com.wandrell.tabletop.pendragon.model.character.stats.DistinctiveFeature;
import com.wandrell.tabletop.pendragon.model.character.stats.Passion;
import com.wandrell.tabletop.pendragon.model.character.stats.Skill;
import com.wandrell.tabletop.pendragon.model.character.stats.SpecialtySkill;
import com.wandrell.tabletop.pendragon.model.character.stats.holder.Attributes;
import com.wandrell.tabletop.pendragon.model.character.stats.holder.CharacteristicsHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.holder.DerivedAttributes;
import com.wandrell.tabletop.pendragon.model.character.stats.holder.Traits;

public interface Character {

    public Integer getAge();

    public Attributes getAttributes();

    public BackgroundInfo getBackgroundInfo();

    public DerivedAttributes getDerivedAttributes();

    public CharacteristicsHolder<DirectedTrait> getDirectedTraits();

    public CharacteristicsHolder<DistinctiveFeature> getDistinctiveFeatures();

    public Gender getGender();

    public Integer getGlory();

    public String getName();

    public CharacteristicsHolder<Passion> getPassions();

    public Traits getPersonalityTraits();

    public String getPlayerName();

    public CharacteristicsHolder<Skill> getSkills();

    public CharacteristicsHolder<SpecialtySkill> getSpecialtySkills();

    public void setAge(final Integer age);

    public void setGlory(final Integer glory);

    public void setPlayerName(final String name);

}
