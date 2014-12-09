package com.wandrell.tabletop.business.model.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Attribute;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.DirectedTrait;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Passion;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Skill;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.SpecialtySkill;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Trait;

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

    public DirectedTrait getDirectedTrait(final String name,
            final String annotation);

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

    public Passion getPassion(final String name, final String annotation);

    public Collection<Passion> getPassions();

    public Trait getPious();

    public Trait getProud();

    public Trait getPrudent();

    public Trait getReckless();

    public Trait getSelfish();

    public Skill getSkill(final String name, final String annotation);

    public Collection<Skill> getSkills();

    public SpecialtySkill getSpecialtySkill(final String name);

    public Collection<SpecialtySkill> getSpecialtySkills();

    public Trait getSuspicious();

    public Trait getTemperate();

    public Trait getTrusting();

    public Trait getValorous();

    public Trait getVengeful();

    public Trait getWordly();

    public void removeDirectedTrait(final String directedTrait);

    public void removePassion(final String passion);

    public void removeSkill(final String skill);

    public void removeSpecialtySkill(final String skill);

    public void
            setDirectedTraits(final Collection<DirectedTrait> directedTraits);

    public void setPassions(final Collection<Passion> passions);

    public void setSkills(final Collection<Skill> skills);

    public void setSpecialtySkills(final Collection<SpecialtySkill> skills);

}
