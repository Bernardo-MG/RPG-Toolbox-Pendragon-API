package com.wandrell.tabletop.pendragon.model.character.stats;

public interface HumanAttributesHolder extends AttributesHolder {

    @Override
    public HumanAttributesHolder createNewInstance();

    public Integer getAppearance();

    public void setAppearance(final Integer appearance);

}
