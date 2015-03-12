package com.wandrell.tabletop.pendragon.model.character;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface PendragonPlayerCharacter extends PendragonHumanCharacter {

    public void addDistinctiveFeature(final DistinctiveFeature feature);

    public void addPet(final Pet pet);

    public void clearDistinctiveFeatures();

    public void clearPet();

    @Override
    public PendragonPlayerCharacter createNewInstance();

    public Collection<DistinctiveFeature> getDistinctiveFeatures();

    public String getFatherClass();

    public String getHomeland();

    public Collection<Pet> getPets();

    public String getPlayerName();

    public void removeDistinctiveFeature(final DistinctiveFeature feature);

    public void removePet(final Pet pet);

    public void setDistinctiveFeatures(
            final Collection<DistinctiveFeature> features);

    public void setPets(final Collection<Pet> pets);

}
