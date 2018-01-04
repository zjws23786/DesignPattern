package com.hh.design.decorator.coffee_type;

import com.hh.design.decorator.base.Coffee;

/**
 * Created by hjz on 2017/12/22 0022.
 * 意大利浓咖啡
 */
public class Espresso extends Coffee{

    public Espresso() {
        super.setDescription("意大利浓咖啡");
        super.setPrice(4.0f);
    }
}
