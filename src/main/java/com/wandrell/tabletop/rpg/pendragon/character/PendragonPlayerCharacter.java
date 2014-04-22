package com.wandrell.tabletop.rpg.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.rpg.pendragon.character.background.Religion;
import com.wandrell.tabletop.rpg.pendragon.character.follower.Follower;
import com.wandrell.tabletop.rpg.pendragon.character.follower.Wife;
import com.wandrell.tabletop.rpg.pendragon.character.module.TraitsBonusSwitchsData;
import com.wandrell.tabletop.rpg.pendragon.glory.GloryController;
import com.wandrell.tabletop.rpg.pendragon.inventory.ArmorData;
import com.wandrell.tabletop.rpg.pendragon.inventory.PendragonItem;
import com.wandrell.tabletop.rpg.pendragon.inventory.PendragonMoneyData;
import com.wandrell.tabletop.rpg.pendragon.manor.ManorAnimal;
import com.wandrell.tabletop.rpg.pendragon.util.TextValue;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonAppearanceFeature;
import com.wandrell.tabletop.rpg.pendragon.valuehandler.PendragonSkill;
import com.wandrell.tabletop.rpg.valuehandler.ValueHandler;

public interface PendragonPlayerCharacter extends PendragonSimpleCharacter {
    public ArmorData getArmorData();

    public PendragonSkill getExclusiveSkill(final String name,
	    final String annotation);

    public Collection<PendragonSkill> getExclusiveSkills();

    public Collection<PendragonAppearanceFeature> getFeatures();

    public Boolean getFlag(final String flag);

    public Collection<String> getFlags();

    public Collection<Follower> getFollowers();

    public GloryController getGloryData();

    public Collection<PendragonItem> getHoldingsAtHome();

    public Collection<PendragonItem> getHoldingsCarried();

    public Collection<HorseCharacter> getHorses();

    public String getKnightKind();

    public PendragonMoneyData getMoney();

    public Collection<ManorAnimal> getPets();

    public String getPlayerName();

    public Religion getReligion();

    public String getTextValue(final String name);

    public Collection<TextValue> getTextValues();

    public TraitsBonusSwitchsData getTraitsBonusSwitchsData();

    public ValueHandler<Integer> getValueHandler(final String value);

    public Collection<ValueHandler<Integer>> getValueHandlers();

    public Collection<Wife> getWives();

    public Boolean hasExclusiveSkill(final String name, final String annotation);

    public Boolean hasTextValue(final String textValue);

    public Boolean hasValueHandler(final String value);

    public boolean isKnight();

}
