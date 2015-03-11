package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.pendragon.model.stats.SpecialtySkillBox;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface PendragonHumanCharacter extends PendragonBaseCharacter {

    public void addDirectedTrait(final SkillBox directedTrait);

    public void addPassion(final SkillBox passion);

    public void addSpecialtySkill(final SpecialtySkillBox skill);

    public void clearDirectedTraits();

    public void clearPassions();

    public void clearSpecialtySkills();

    @Override
    public PendragonHumanCharacter createNewInstance();

    public Integer getAppearance();

    public Integer getArbitrary();

    public Integer getChaste();

    public Integer getCowardly();

    public Integer getCruel();

    public Integer getDeceitful();

    public Collection<SkillBox> getDirectedTraits();

    public Integer getEnergetic();

    public Integer getForgiving();

    public Gender getGender();

    public Integer getGenerous();

    public Integer getHonest();

    public Integer getIndulgent();

    public Integer getJust();

    public Integer getLazy();

    public Integer getLustful();

    public Integer getMerciful();

    public Integer getModest();

    public Collection<SkillBox> getPassions();

    public Integer getPious();

    public Integer getProud();

    public Integer getPrudent();

    public Integer getReckless();

    public Integer getSelfish();

    public Collection<SpecialtySkillBox> getSpecialtySkills();

    public Integer getSuspicious();

    public Integer getTemperate();

    public Integer getTrusting();

    public Integer getValorous();

    public Integer getVengeful();

    public Integer getWorldly();

    public void removeDirectedTrait(final SkillBox directedTrait);

    public void removePassion(final SkillBox passion);

    public void removeSpecialtySkill(final SpecialtySkillBox skill);

    public void setAppearance(final Integer appearance);

    public void setArbitrary(final Integer arbitrary);

    public void setChaste(final Integer chaste);

    public void setCowardly(final Integer cowardly);

    public void setCruel(final Integer cruel);

    public void setDeceitful(final Integer deceitful);

    public void setDirectedTraits(final Collection<SkillBox> directedTraits);

    public void setEnergetic(final Integer energetic);

    public void setForgiving(final Integer forgiving);

    public void setGenerous(final Integer generous);

    public void setHonest(final Integer honest);

    public void setIndulgent(final Integer indulgent);

    public void setJust(final Integer just);

    public void setLazy(final Integer lazy);

    public void setLustful(final Integer lustful);

    public void setMerciful(final Integer merciful);

    public void setModest(final Integer modest);

    public void setPassions(final Collection<SkillBox> passions);

    public void setPious(final Integer pious);

    public void setProud(final Integer proud);

    public void setPrudent(final Integer prudent);

    public void setReckless(final Integer reckless);

    public void setSelfish(final Integer selfish);

    public void setSpecialtySkills(final Collection<SpecialtySkillBox> skills);

    public void setSuspicious(final Integer suspicious);

    public void setTemperate(final Integer temperate);

    public void setTrusting(final Integer trusting);

    public void setValorous(final Integer valorous);

}
