package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.pendragon.model.character.background.BackgroundInfo;
import com.wandrell.tabletop.pendragon.model.character.event.PendragonCharacterListener;
import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.DerivedAttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.SkillsHolder;

public interface PendragonCharacter extends Prototype {

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addPendragonCharacterListener(
            final PendragonCharacterListener listener);

    @Override
    public PendragonCharacter createNewInstance();

    public AttributesHolder getAttributes();

    public BackgroundInfo getBackgroundInfo();

    public DerivedAttributesHolder getDerivedAttributes();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public Gender getGender();

    public Integer getGlory();

    public String getName();

    public SkillsHolder getSkills();

    public void removeDistinctiveFeature(final DistinctiveFeature feature);

    public void removePendragonCharacterListener(
            final PendragonCharacterListener listener);

    public void setDistinctiveFeatures(
            final Collection<DistinctiveFeature> features);

    public void setGlory(final Integer glory);

    public void setKnight(final Boolean knight);

}
