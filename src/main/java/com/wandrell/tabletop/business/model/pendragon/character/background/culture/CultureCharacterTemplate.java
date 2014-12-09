package com.wandrell.tabletop.business.model.pendragon.character.background.culture;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.valuehandler.Attribute;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.DirectedTrait;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Passion;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Skill;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.SpecialtySkill;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Trait;
import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface CultureCharacterTemplate {

    public Collection<Attribute> getAttributes();

    public Collection<EditableValueHandler> getDerivedAttributes();

    public Collection<DirectedTrait> getDirectedTraits();

    public Collection<Skill> getExclusiveSkills();

    public Collection<Passion> getPassions();

    public Collection<Skill> getSkills();

    public Collection<SpecialtySkill> getSpecialtySkills();

    public Collection<Trait> getTraits();

}
