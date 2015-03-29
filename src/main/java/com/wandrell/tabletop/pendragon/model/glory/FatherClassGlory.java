package com.wandrell.tabletop.pendragon.model.glory;

import com.wandrell.pattern.prototype.Prototype;

public interface FatherClassGlory extends Prototype {

    @Override
    public FatherClassGlory createNewInstance();

    public Integer getBaseGlory();

    public String getFatherClass();

    public Integer getYearlyGlory();

}
