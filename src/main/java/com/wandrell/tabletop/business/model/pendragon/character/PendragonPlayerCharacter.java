package com.wandrell.tabletop.business.model.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.character.background.DistinctiveFeature;
import com.wandrell.tabletop.business.model.pendragon.character.background.Religion;
import com.wandrell.tabletop.business.model.pendragon.character.follower.Follower;
import com.wandrell.tabletop.business.model.pendragon.character.follower.Wife;
import com.wandrell.tabletop.business.model.pendragon.glory.GloryManager;
import com.wandrell.tabletop.business.model.pendragon.inventory.Item;
import com.wandrell.tabletop.business.model.pendragon.inventory.Money;
import com.wandrell.tabletop.business.model.pendragon.manor.Pet;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.DerivedAttribute;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Skill;
import com.wandrell.tabletop.business.model.valuehandler.EditableValueHandler;
import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;

public interface PendragonPlayerCharacter extends PendragonHumanCharacter {

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addExclusiveSkill(final Skill skill);

    public void addFollower(final Follower follower);

    public void addHoldingAtHome(final Item item);

    public void addHoldingCarried(final Item item);

    public void addHorse(final HorseCharacter horse);

    public void addPet(final Pet pet);

    public void addWife(final Wife wife);

    public void clearDistinctiveFeatures();

    public void clearExclusiveSkills();

    public void clearFollowers();

    public void clearHoldingsAtHome();

    public void clearHoldingsCarried();

    public void clearHorse();

    public void clearPet();

    public void clearWives();

    @Override
    public PendragonPlayerCharacter createNewInstance();

    public ValueHandler getArmor();

    public String getCulture();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public DerivedAttribute getDistinctiveFeaturesCount();

    public Skill getExclusiveSkill(final String name, final String annotation);

    public Collection<Skill> getExclusiveSkills();

    public String getFatherClass();

    public Boolean getFlag(final String name);

    public Collection<String> getFlags();

    public Collection<Follower> getFollowers();

    public GloryManager getGlory();

    public Collection<Item> getHoldingsAtHome();

    public Collection<Item> getHoldingsCarried();

    public String getHomeland();

    public Collection<HorseCharacter> getHorses();

    public Money getMoney();

    public Collection<Pet> getPets();

    public String getPlayerName();

    public Religion getReligion();

    public EditableValueHandler getValueHandler(final String name);

    public Collection<EditableValueHandler> getValueHandlers();

    public Collection<Wife> getWives();

    public Boolean hasDistinctiveFeature(final String feature);

    public Boolean
            hasExclusiveSkill(final String name, final String annotation);

    public Boolean hasFollower(final String follower);

    public Boolean hasHoldingAtHome(final Item item);

    public Boolean hasHoldingCarried(final Item item);

    public Boolean hasHorse(final HorseCharacter horse);

    public Boolean hasValueHandler(final String name);

    public Boolean isKnight();

    public void removeDistinctiveFeature(final String feature);

    public void removeExclusiveSkill(final String skill);

    public void removeFollower(final String follower);

    public void removeHoldingAtHome(final Item item);

    public void removeHoldingCarried(final Item item);

    public void removeHorse(final HorseCharacter horse);

    public void removePet(final Pet pet);

    public void removeWife(final Wife wife);

    public void setDistinctiveFeatures(
            final Collection<DistinctiveFeature> features);

    public void setExclusiveSkills(final Collection<Skill> skill);

    public void setFollowers(final Collection<Follower> followers);

    public void setHoldingsAtHome(final Collection<Item> items);

    public void setHoldingsCarried(final Collection<Item> items);

    public void setHorse(final Collection<HorseCharacter> horses);

    public void setKnight(final Boolean isKnight);

    public void setPet(final Collection<Pet> pets);

    public void setWives(final Collection<Wife> wive);

}
