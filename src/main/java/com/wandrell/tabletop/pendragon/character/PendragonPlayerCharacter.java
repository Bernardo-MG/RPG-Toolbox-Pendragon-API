package com.wandrell.tabletop.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.character.background.Religion;
import com.wandrell.tabletop.pendragon.character.follower.Follower;
import com.wandrell.tabletop.pendragon.character.follower.Wife;
import com.wandrell.tabletop.pendragon.character.module.TraitsBonusSwitchsData;
import com.wandrell.tabletop.pendragon.glory.GloryKeeper;
import com.wandrell.tabletop.pendragon.inventory.ArmorData;
import com.wandrell.tabletop.pendragon.inventory.PendragonItem;
import com.wandrell.tabletop.pendragon.inventory.PendragonMoney;
import com.wandrell.tabletop.pendragon.manor.ManorAnimal;
import com.wandrell.tabletop.pendragon.util.TextValue;
import com.wandrell.tabletop.pendragon.valuehandler.DerivedAttribute;
import com.wandrell.tabletop.pendragon.valuehandler.DistinctiveFeature;
import com.wandrell.tabletop.pendragon.valuehandler.Skill;
import com.wandrell.tabletop.valuehandler.ValueHandler;

public interface PendragonPlayerCharacter extends PendragonSimpleCharacter {

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addExclusiveSkill(final Skill skill);

    public void addFollower(final Follower follower);

    public void addHoldingAtHome(final PendragonItem item);

    public void addHoldingCarried(final PendragonItem item);

    public void addHorse(final HorseCharacter horse);

    public void addPet(final ManorAnimal pet);

    public void addTextValue(final String key, final String value);

    public void addValueHandler(final ValueHandler<Integer> value);

    public void addWife(final Wife wife);

    @Override
    public PendragonPlayerCharacter createNewInstance();

    public ArmorData getArmor();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public DerivedAttribute getDistinctiveFeaturesCount();

    public Skill getExclusiveSkill(final String name, final String annotation);

    public Collection<Skill> getExclusiveSkills();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public Collection<Follower> getFollowers();

    public GloryKeeper getGlory();

    public Collection<PendragonItem> getHoldingsAtHome();

    public Collection<PendragonItem> getHoldingsCarried();

    public Collection<HorseCharacter> getHorses();

    public PendragonMoney getMoney();

    public Collection<ManorAnimal> getPets();

    public String getPlayerName();

    public Religion getReligion();

    public String getTextValue(final String name);

    public Collection<TextValue> getTextValues();

    public TraitsBonusSwitchsData getTraitsBonusSwitchsData();

    public ValueHandler<Integer> getValueHandler(final String name);

    public Collection<ValueHandler<Integer>> getValueHandlers();

    public Collection<Wife> getWives();

    public Boolean hasExclusiveSkill(final String name, final String annotation);

    public Boolean hasTextValue(final String name);

    public Boolean hasValueHandler(final String name);

    public Boolean isKnight();

    public void setKnight(final Boolean isKnight);

}
