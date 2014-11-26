package com.wandrell.tabletop.business.model.pendragon.manor;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.pendragon.util.PathNameWrapper;

public interface AnimalYearResult {

    public Path getFile(final String name);

    public Collection<PathNameWrapper> getFiles();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public String getName();

    public Map<String, Integer> getValues();

    public Boolean hasFile(final String name);

}
