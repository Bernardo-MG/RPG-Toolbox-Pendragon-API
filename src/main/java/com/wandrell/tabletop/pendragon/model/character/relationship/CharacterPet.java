package com.wandrell.tabletop.pendragon.model.character.relationship;

import com.wandrell.tabletop.pendragon.model.character.PendragonHumanCharacter;
import com.wandrell.tabletop.pendragon.model.manor.Pet;

public interface CharacterPet {

    public PendragonHumanCharacter getCharacter();

    public Pet getPet();

}
