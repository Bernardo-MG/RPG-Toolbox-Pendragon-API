
package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.background.BackgroundInfo;
import com.wandrell.tabletop.pendragon.model.character.event.PendragonCharacterListener;
import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.DerivedAttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.SkillsHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.TraitsHolder;

public interface Character {

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addPendragonCharacterListener(
            final PendragonCharacterListener listener);

    public void clearDistinctiveFeatures();

    public AttributesHolder getAttributes();

    public BackgroundInfo getBackgroundInfo();

    public DerivedAttributesHolder getDerivedAttributes();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public Gender getGender();

    public Integer getGlory();

    public String getName();

    public SkillsHolder getSkills();

    public TraitsHolder getTraits();

    public void removeDistinctiveFeature(final DistinctiveFeature feature);

    public void removePendragonCharacterListener(
            final PendragonCharacterListener listener);

    public void setDistinctiveFeatures(
            final Collection<DistinctiveFeature> features);

    public void setGlory(final Integer glory);

}
