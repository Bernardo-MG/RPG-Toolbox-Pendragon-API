package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.pendragon.model.character.event.PendragonCharacterListener;
import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.DerivedAttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.PendragonSkillBox;

public interface PendragonBaseCharacter extends Prototype {

    public void addPendragonCharacterListener(
            final PendragonCharacterListener listener);

    public void addSkill(final PendragonSkillBox skill);

    public void clearSkills();

    @Override
    public PendragonBaseCharacter createNewInstance();

    public AttributesHolder getAttributes();

    public DerivedAttributesHolder getDerivedAttributes();

    public String getName();

    public Collection<PendragonSkillBox> getSkills();

    public void removePendragonCharacterListener(
            final PendragonCharacterListener listener);

    public void removeSkill(final PendragonSkillBox skill);

    public void setSkills(final Collection<PendragonSkillBox> skills);

}
