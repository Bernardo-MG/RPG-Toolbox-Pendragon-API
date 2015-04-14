package com.wandrell.tabletop.pendragon.model.character.stats;

import java.util.Collection;

import com.wandrell.tabletop.valuebox.SkillBox;

public interface SkillsHolder {

    public void addDirectedTrait(final SkillBox directedTrait);

    public void addPassion(final SkillBox passion);

    public void addSkill(final PendragonSkillBox skill);

    public void addSpecialtySkill(final SpecialtySkillBox skill);

    public void clearDirectedTraits();

    public void clearDistinctiveFeatures();

    public void clearPassions();

    public void clearSkills();

    public void clearSpecialtySkills();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getPassions();

    public Collection<PendragonSkillBox> getSkills();

    public Collection<SpecialtySkillBox> getSpecialtySkills();

    public void removeDirectedTrait(final SkillBox directedTrait);

    public void removePassion(final SkillBox passion);

    public void removeSkill(final PendragonSkillBox skill);

    public void removeSpecialtySkill(final SpecialtySkillBox skill);

    public void setDirectedTraits(final Collection<SkillBox> directedTraits);

    public void setPassions(final Collection<SkillBox> passions);

    public void setSkills(final Collection<PendragonSkillBox> skills);

    public void setSpecialtySkills(final Collection<SpecialtySkillBox> skills);

}
