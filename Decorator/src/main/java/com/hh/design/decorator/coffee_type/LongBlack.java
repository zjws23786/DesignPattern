package com.hh.design.decorator.coffee_type;

import com.hh.design.decorator.base.Coffee;

/**
 * Created by hjz on 2017/12/22 0022.
 * 美式咖啡
 */
public class LongBlack extends Coffee{

    public LongBlack() {
        super.setDescription("美式咖啡");
        super.setPrice(6.0f);
    }
}
