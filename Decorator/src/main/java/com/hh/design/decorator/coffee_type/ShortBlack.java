package com.hh.design.decorator.coffee_type;

import com.hh.design.decorator.base.Coffee;

/**
 * Created by hjz on 2017/12/22 0022.
 * 浓缩咖啡
 */
public class ShortBlack extends Coffee{

    public ShortBlack() {
        super.setDescription("浓缩咖啡");
        super.setPrice(5.0f);

    }
}
