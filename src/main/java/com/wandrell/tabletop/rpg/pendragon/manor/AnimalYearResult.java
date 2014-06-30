package com.wandrell.tabletop.rpg.pendragon.manor;

import java.nio.file.Path;
import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.util.FileNameWrapper;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface AnimalYearResult extends NewInstantiable {

    @Override
    public AnimalYearResult createNewInstance();

    public Path getFile(final String name);

    public Collection<FileNameWrapper> getFiles();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public String getName();

    public ValueHandler<Integer> getValue(final String name);

    public Collection<ValueHandler<Integer>> getValues();

    public Boolean hasFile(final String name);

    public Boolean hasValue(final String name);

}
