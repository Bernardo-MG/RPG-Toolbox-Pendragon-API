package com.wandrell.tabletop.pendragon.model.character.stats;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.pendragon.model.character.stats.event.AttributesListener;

public interface AttributesHolder extends Prototype {

    public void addAttributesListener(final AttributesListener listener);

    @Override
    public AttributesHolder createNewInstance();

    public Integer getConstitution();

    public Integer getDexterity();

    public Integer getSize();

    public Integer getStrength();

    public void removeAttributesListener(final AttributesListener listener);

    public void setConstitution(final Integer constitution);

    public void setDexterity(final Integer dexterity);

    public void setSize(final Integer size);

    public void setStrength(final Integer strength);

}
