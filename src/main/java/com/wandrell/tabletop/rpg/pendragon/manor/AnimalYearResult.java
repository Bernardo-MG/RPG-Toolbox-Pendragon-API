package com.wandrell.tabletop.rpg.pendragon.manor;

import java.nio.file.Path;
import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.util.FileNameWrapper;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface AnimalYearResult {

    public Path getFile(final String name);

    public Collection<FileNameWrapper> getFiles();

    public boolean getFlag(final String name);

    public Collection<String> getFlags();

    public String getName();

    public ValueHandler<Integer> getValue(final String name);

    public Collection<ValueHandler<Integer>> getValues();

    public boolean hasFile(final String name);

    public boolean hasValue(final String name);

}
