package com.wandrell.tabletop.pendragon.model.glory;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface FatherClassGlory extends NewInstantiable {

    @Override
    public FatherClassGlory createNewInstance();

    public Integer getBaseGlory();

    public String getFatherClass();

    public Integer getYearlyGlory();

}
