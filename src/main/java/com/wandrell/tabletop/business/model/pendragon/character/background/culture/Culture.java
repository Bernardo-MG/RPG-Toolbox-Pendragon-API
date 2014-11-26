package com.wandrell.tabletop.business.model.pendragon.character.background.culture;

import java.nio.file.Path;
import java.util.Collection;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.dice.RollTable;
import com.wandrell.tabletop.business.model.pendragon.inventory.AdditionalBelongings;
import com.wandrell.tabletop.business.model.pendragon.util.PathNameWrapper;

public interface Culture {

    public Path getFamilyCharacteristicFile(final Gender gender);

    public CultureCharacterTemplate getFemaleRandomTemplate();

    public CultureCharacterTemplate getFemaleTemplate();

    public Path getFile(final String name);

    public Collection<PathNameWrapper> getFiles();

    public RollTable<AdditionalBelongings> getInitialLuckTable(
            final Gender gender);

    public CultureCharacterTemplate getMaleRandomTemplate();

    public CultureCharacterTemplate getMaleTemplate();

    public String getName();

    public Boolean hasFile(final String name);

}
