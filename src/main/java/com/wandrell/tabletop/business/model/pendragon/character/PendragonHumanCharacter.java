package com.wandrell.tabletop.business.model.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.pendragon.stats.Skill;
import com.wandrell.tabletop.business.model.pendragon.stats.SpecialtySkill;
import com.wandrell.tabletop.business.model.valuebox.SkillBox;

public interface PendragonHumanCharacter extends PendragonBaseCharacter {

    public void addDirectedTrait(final SkillBox directedTrait);

    public void addPassion(final SkillBox passion);

    public void addSkill(final Skill skill);

    public void addSpecialtySkill(final SpecialtySkill skill);

    public void clearDirectedTraits();

    public void clearPassions();

    public void clearSkills();

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

    public Collection<Skill> getSkills();

    public Collection<SpecialtySkill> getSpecialtySkills();

    public Integer getSuspicious();

    public Integer getTemperate();

    public Integer getTrusting();

    public Integer getValorous();

    public Integer getVengeful();

    public Integer getWordly();

    public void removeDirectedTrait(final SkillBox directedTrait);

    public void removePassion(final SkillBox passion);

    public void removeSkill(final Skill skill);

    public void removeSpecialtySkill(final SpecialtySkill skill);

    public void setDirectedTraits(final Collection<SkillBox> directedTraits);

    public void setPassions(final Collection<SkillBox> passions);

    public void setSkills(final Collection<Skill> skills);

    public void setSpecialtySkills(final Collection<SpecialtySkill> skills);

}
