
package com.wandrell.tabletop.pendragon.model.chargen.background;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.AttributesRandom;
import com.wandrell.tabletop.pendragon.model.character.stats.DirectedTrait;
import com.wandrell.tabletop.pendragon.model.character.stats.Passion;
import com.wandrell.tabletop.pendragon.model.character.stats.PendragonSkill;
import com.wandrell.tabletop.pendragon.model.character.stats.SpecialtySkill;
import com.wandrell.tabletop.pendragon.model.character.stats.TraitsHolder;
import com.wandrell.tabletop.pendragon.model.chargen.stats.RandomSkill;

public interface CultureCharacterTemplate {

    public AttributesHolder getAttributes();

    public AttributesRandom getAttributesRandom();

    public Collection<DirectedTrait> getDirectedTraits();

    public Collection<Passion> getPassions();

    public Collection<RandomSkill> getPassionsRandom();

    public Collection<PendragonSkill> getSkills();

    public Collection<SpecialtySkill> getSpecialtySkills();

    public TraitsHolder getTraits();

}
