
package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.tabletop.pendragon.model.character.stats.event.AttributesListener;

public interface AttributesHolder {

    public void addAttributesListener(final AttributesListener listener);

    public Integer getAppearance();

    public Integer getConstitution();

    public Integer getDexterity();

    public Integer getSize();

    public Integer getStrength();

    public void removeAttributesListener(final AttributesListener listener);

    public void setAppearance(final Integer appearance);

    public void setConstitution(final Integer constitution);

    public void setDexterity(final Integer dexterity);

    public void setSize(final Integer size);

    public void setStrength(final Integer strength);

}
