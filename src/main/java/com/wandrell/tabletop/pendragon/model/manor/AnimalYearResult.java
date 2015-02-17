package com.wandrell.tabletop.pendragon.model.manor;

import com.wandrell.tabletop.pendragon.model.inventory.Money;

public interface AnimalYearResult {

    public String getDescription();

    public Money getMoney();

    public String getPuppy();

    public Boolean isDying();

    public Boolean isHavingPuppies();

    public Boolean isProducingMoney();

}
