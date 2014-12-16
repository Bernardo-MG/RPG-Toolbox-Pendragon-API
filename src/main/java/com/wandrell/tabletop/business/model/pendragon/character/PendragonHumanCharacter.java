package com.wandrell.tabletop.business.model.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.pendragon.stats.Attribute;
import com.wandrell.tabletop.business.model.pendragon.stats.DirectedTrait;
import com.wandrell.tabletop.business.model.pendragon.stats.Passion;
import com.wandrell.tabletop.business.model.pendragon.stats.Skill;
import com.wandrell.tabletop.business.model.pendragon.stats.SpecialtySkill;
import com.wandrell.tabletop.business.model.pendragon.stats.Trait;

public interface PendragonHumanCharacter extends PendragonBaseCharacter {

    public void addDirectedTrait(final DirectedTrait directedTrait);

    public void addPassion(final Passion passion);

    public void addSkill(final Skill skill);

    public void addSpecialtySkill(final SpecialtySkill skill);

    public void clearDirectedTraits();

    public void clearPassions();

    public void clearSkills();

    public void clearSpecialtySkills();

    @Override
    public PendragonHumanCharacter createNewInstance();

    public Attribute getAppearance();

    public Trait getArbitrary();

    public Trait getChaste();

    public Trait getCowardly();

    public Trait getCruel();

    public Trait getDeceitful();

    public Collection<DirectedTrait> getDirectedTraits();

    public Trait getEnergetic();

    public Trait getForgiving();

    public Gender getGender();

    public Trait getGenerous();

    public Trait getHonest();

    public Trait getIndulgent();

    public Trait getJust();

    public Trait getLazy();

    public Trait getLustful();

    public Trait getMerciful();

    public Trait getModest();

    public Collection<Passion> getPassions();

    public Trait getPious();

    public Trait getProud();

    public Trait getPrudent();

    public Trait getReckless();

    public Trait getSelfish();

    public Collection<Skill> getSkills();

    public Collection<SpecialtySkill> getSpecialtySkills();

    public Trait getSuspicious();

    public Trait getTemperate();

    public Trait getTrusting();

    public Trait getValorous();

    public Trait getVengeful();

    public Trait getWordly();

    public void removeDirectedTrait(final DirectedTrait directedTrait);

    public void removePassion(final Passion passion);

    public void removeSkill(final Skill skill);

    public void removeSpecialtySkill(final SpecialtySkill skill);

    public void
            setDirectedTraits(final Collection<DirectedTrait> directedTraits);

    public void setPassions(final Collection<Passion> passions);

    public void setSkills(final Collection<Skill> skills);

    public void setSpecialtySkills(final Collection<SpecialtySkill> skills);

}
