package com.wandrell.tabletop.pendragon.model.character.background;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.pendragon.model.character.stats.TraitsHolder;

public interface BackgroundInfo extends Prototype {

    public String getCulture();

    public String getFatherClass();

    public String getHomeland();

    public String getPlayerName();

    public Religion getReligion();

    public TraitsHolder getTraits();

    public Boolean isKnight();

    public void setReligion(final Religion religion);

}
