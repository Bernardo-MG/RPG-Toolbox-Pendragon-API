
package com.wandrell.tabletop.pendragon.model.character.background;

public interface BackgroundInfo {

    public String getCulture();

    public String getFatherClass();

    public String getHomeland();

    public String getPlayerName();

    public Religion getReligion();

    public Boolean isKnight();

    public void setCulture(final String culture);

    public void setFatherClass(final String fatherClass);

    public void setHomeland(final String homeland);

    public void setKnight(final Boolean knight);

    public void setPlayerName(final String name);

    public void setReligion(final Religion religion);

}
