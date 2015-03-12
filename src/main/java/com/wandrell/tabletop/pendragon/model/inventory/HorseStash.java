package com.wandrell.tabletop.pendragon.model.inventory;

import com.wandrell.tabletop.pendragon.model.character.Horse;

public interface HorseStash extends Stash {

    public Horse getHorse();

    public void setHorse(final Horse horse);

}
