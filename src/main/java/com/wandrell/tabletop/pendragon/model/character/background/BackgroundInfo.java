
package com.wandrell.tabletop.pendragon.model.character.background;

public interface BackgroundInfo {

    public String getCulture();

    public String getFatherClass();

    public String getHomeland();

    public String getLiegeLord();

    public Religion getReligion();

    public Integer getSonNumber();

    public Boolean isKnight();

    public void setCulture(final String culture);

    public void setFatherClass(final String fatherClass);

    public void setHomeland(final String homeland);

    public void setKnight(final Boolean knight);

    public void setLiegeLord(final String liege);

    public void setReligion(final Religion religion);

    public void setSonNumber(final Integer son);

}
