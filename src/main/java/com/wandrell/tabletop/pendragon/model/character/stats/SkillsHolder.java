
package com.wandrell.tabletop.pendragon.model.character.stats;

import java.util.Collection;

public interface SkillsHolder {

    public void addDirectedTrait(final DirectedTrait directedTrait);

    public void addPassion(final Passion passion);

    public void addSkill(final PendragonSkill skill);

    public void addSpecialtySkill(final SpecialtySkill skill);

    public void clearDirectedTraits();

    public void clearPassions();

    public void clearSkills();

    public void clearSpecialtySkills();

    public Collection<DirectedTrait> getDirectedTraits();

    public Collection<Passion> getPassions();

    public Collection<PendragonSkill> getSkills();

    public Collection<SpecialtySkill> getSpecialtySkills();

    public void removeDirectedTrait(final DirectedTrait directedTrait);

    public void removePassion(final Passion passion);

    public void removeSkill(final PendragonSkill skill);

    public void removeSpecialtySkill(final SpecialtySkill skill);

    public void
            setDirectedTraits(final Collection<DirectedTrait> directedTraits);

    public void setPassions(final Collection<Passion> passions);

    public void setSkills(final Collection<PendragonSkill> skills);

    public void setSpecialtySkills(final Collection<SpecialtySkill> skills);

}
