
package com.wandrell.tabletop.pendragon.model.character.relationship;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.Character;
import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface CharacterPets {

    public Character getCharacter();

    public Collection<Pet> getPets();

}
