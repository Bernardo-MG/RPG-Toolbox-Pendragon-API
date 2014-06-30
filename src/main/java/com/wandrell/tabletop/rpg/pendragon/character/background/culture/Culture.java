package com.wandrell.tabletop.rpg.pendragon.character.background.culture;

import java.nio.file.Path;
import java.util.Collection;

import com.wandrell.tabletop.rpg.character.Gender;
import com.wandrell.tabletop.rpg.dice.RollTable;
import com.wandrell.tabletop.rpg.pendragon.inventory.AdditionalBelongings;
import com.wandrell.tabletop.rpg.pendragon.util.FileNameWrapper;
import com.wandrell.util.tag.NewInstantiable;

public interface Culture extends NewInstantiable {

    @Override
    public Culture createNewInstance();

    public Path getFamilyCharacteristicFile(final Gender gender);

    public CultureCharacterTemplate getFemaleRandomTemplate();

    public CultureCharacterTemplate getFemaleTemplate();

    public Path getFile(final String name);

    public Collection<FileNameWrapper> getFiles();

    public RollTable<AdditionalBelongings> getInitialLuckTable(
	    final Gender gender);

    public CultureCharacterTemplate getMaleRandomTemplate();

    public CultureCharacterTemplate getMaleTemplate();

    public String getName();

    public Boolean hasFile(final String name);

}
