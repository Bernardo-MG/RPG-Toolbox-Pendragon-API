package com.wandrell.tabletop.rpg.pendragon.character.background.culture;

import java.nio.file.Path;
import java.util.Collection;

import com.wandrell.tabletop.rpg.character.Gender;
import com.wandrell.tabletop.rpg.dice.RollTable;
import com.wandrell.tabletop.rpg.pendragon.inventory.AdditionalBelongingsSetData;
import com.wandrell.tabletop.rpg.pendragon.util.FileNameWrapper;

public interface Culture {

    public Path getFamilyCharacteristicFile(final Gender gender);

    public CultureCharacterTemplate getFemaleRandomTemplate();

    public CultureCharacterTemplate getFemaleTemplate();

    public Path getFile(final String name);

    public Collection<FileNameWrapper> getFiles();

    public RollTable<AdditionalBelongingsSetData> getInitialLuckTable(
	    final Gender gender);

    public CultureCharacterTemplate getMaleRandomTemplate();

    public CultureCharacterTemplate getMaleTemplate();

    public String getName();

    public Boolean hasFile(final String name);

}
