package com.wandrell.tabletop.pendragon.manor;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.pendragon.util.PathNameWrapper;

public interface AnimalYearResult {

    public Path getFile(final String name);

    public Collection<PathNameWrapper> getFiles();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public String getName();

    public Map<String, Integer> getValues();

    public Boolean hasFile(final String name);

}
