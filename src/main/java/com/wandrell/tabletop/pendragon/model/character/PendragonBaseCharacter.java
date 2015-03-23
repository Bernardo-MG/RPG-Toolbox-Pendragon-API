package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.pendragon.model.character.event.PendragonCharacterListener;
import com.wandrell.tabletop.pendragon.model.character.stats.PendragonSkillBox;

public interface PendragonBaseCharacter extends NewInstantiable {

    public void addPendragonCharacterListener(
            final PendragonCharacterListener listener);

    public void addSkill(final PendragonSkillBox skill);

    public void clearSkills();

    @Override
    public PendragonBaseCharacter createNewInstance();

    public Integer getConstitution();

    public Integer getDamage();

    public Integer getDexterity();

    public Integer getDexterityRoll();

    public Integer getHealingRate();

    public Integer getHitPoints();

    public Integer getMajorWoundTreshold();

    public Integer getMoveRate();

    public String getName();

    public Integer getSize();

    public Collection<PendragonSkillBox> getSkills();

    public Integer getStrength();

    public Integer getUnconciousTreshold();

    public Integer getWeight();

    public void removePendragonCharacterListener(
            final PendragonCharacterListener listener);

    public void removeSkill(final PendragonSkillBox skill);

    public void setConstitution(final Integer constitution);

    public void setDexterity(final Integer dexterity);

    public void setSize(final Integer size);

    public void setSkills(final Collection<PendragonSkillBox> skills);

    public void setStrength(final Integer strength);

}
