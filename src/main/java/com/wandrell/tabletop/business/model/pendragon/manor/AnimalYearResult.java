package com.wandrell.tabletop.business.model.pendragon.manor;

import com.wandrell.tabletop.business.model.pendragon.inventory.Money;

public interface AnimalYearResult {

    public String getDescription();

    public Money getMoney();

    public String getPuppy();

    public Boolean isDying();

    public Boolean isHavingPuppies();

    public Boolean isProducingMoney();

}
