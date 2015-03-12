package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.follower.Follower;
import com.wandrell.tabletop.pendragon.model.character.follower.Wife;
import com.wandrell.tabletop.pendragon.model.inventory.Money;
import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface PendragonPlayerCharacter extends PendragonHumanCharacter {

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addFollower(final Follower follower);

    public void addHorse(final Horse horse);

    public void addPet(final Pet pet);

    public void addWife(final Wife wife);

    public void clearDistinctiveFeatures();

    public void clearFollowers();

    public void clearHorses();

    public void clearPet();

    public void clearWives();

    @Override
    public PendragonPlayerCharacter createNewInstance();

    public Integer getArmor();

    public String getCulture();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public String getFatherClass();

    public Collection<Follower> getFollowers();

    public String getHomeland();

    public Collection<Horse> getHorses();

    public Money getMoney();

    public Collection<Pet> getPets();

    public String getPlayerName();

    public String getReligion();

    public Collection<Wife> getWives();

    public Boolean isKnight();

    public void removeDistinctiveFeature(final DistinctiveFeature feature);

    public void removeFollower(final Follower follower);

    public void removeHorse(final Horse horse);

    public void removePet(final Pet pet);

    public void removeWife(final Wife wife);

    public void setDistinctiveFeatures(
            final Collection<DistinctiveFeature> features);

    public void setFollowers(final Collection<Follower> followers);

    public void setHorses(final Collection<Horse> horses);

    public void setPets(final Collection<Pet> pets);

    public void setWives(final Collection<Wife> wive);

}
