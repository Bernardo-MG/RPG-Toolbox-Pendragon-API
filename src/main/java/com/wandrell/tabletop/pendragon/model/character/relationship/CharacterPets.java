package com.wandrell.tabletop.pendragon.model.character.relationship;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.PendragonCharacter;
import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface CharacterPets {

    public PendragonCharacter getCharacter();

    public Collection<Pet> getPets();

}
