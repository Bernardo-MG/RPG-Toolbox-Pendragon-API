package com.wandrell.tabletop.pendragon.model.character.relationship;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.PendragonHumanCharacter;
import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface CharacterPets {

    public PendragonHumanCharacter getCharacter();

    public Collection<Pet> getPets();

}
