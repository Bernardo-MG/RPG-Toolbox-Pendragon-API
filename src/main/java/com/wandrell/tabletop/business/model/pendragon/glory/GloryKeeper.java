package com.wandrell.tabletop.business.model.pendragon.glory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;

public interface GloryKeeper {

    public EditableValueHandler getAnnualGlorySource(final String name);

    public Collection<EditableValueHandler> getAnnualGlorySources();

    public Collection<GloryEvent> getHistory();

    public Boolean hasAnnualGlorySource(final String name);

}
