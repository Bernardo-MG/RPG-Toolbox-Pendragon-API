package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.pendragon.model.character.background.Religion;
import com.wandrell.tabletop.pendragon.model.character.stats.SpecialtySkillBox;
import com.wandrell.tabletop.pendragon.model.character.stats.TraitsHolder;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface PendragonHumanCharacter extends PendragonBaseCharacter {

    public void addDirectedTrait(final SkillBox directedTrait);

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addPassion(final SkillBox passion);

    public void addSpecialtySkill(final SpecialtySkillBox skill);

    public void clearDirectedTraits();

    public void clearDistinctiveFeatures();

    public void clearPassions();

    public void clearSpecialtySkills();

    @Override
    public PendragonHumanCharacter createNewInstance();

    public Integer getAppearance();

    public String getCulture();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public String getFatherClass();

    public Gender getGender();

    public Integer getGlory();

    public String getHomeland();

    public Collection<SkillBox> getPassions();

    public String getPlayerName();

    public Religion getReligion();

    public Collection<SpecialtySkillBox> getSpecialtySkills();

    public TraitsHolder getTraits();

    public Boolean isKnight();

    public void removeDirectedTrait(final SkillBox directedTrait);

    public void removeDistinctiveFeature(final DistinctiveFeature feature);

    public void removePassion(final SkillBox passion);

    public void removeSpecialtySkill(final SpecialtySkillBox skill);

    public void setAppearance(final Integer appearance);

    public void setDirectedTraits(final Collection<SkillBox> directedTraits);

    public void setDistinctiveFeatures(
            final Collection<DistinctiveFeature> features);

    public void setGlory(final Integer glory);

    public void setKnight(final Boolean knight);

    public void setPassions(final Collection<SkillBox> passions);

    public void setReligion(final Religion religion);

    public void setSpecialtySkills(final Collection<SpecialtySkillBox> skills);

}
