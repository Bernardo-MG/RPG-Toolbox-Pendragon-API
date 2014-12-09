package com.wandrell.tabletop.business.model.pendragon.valuehandler;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface SpecialtySkill extends EditableValueHandler {

    @Override
    public SpecialtySkill createNewInstance();

    public Collection<String> getSurrogatedSkills();

}
