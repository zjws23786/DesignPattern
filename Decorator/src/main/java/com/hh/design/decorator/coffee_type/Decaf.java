package com.hh.design.decorator.coffee_type;

import com.hh.design.decorator.base.Coffee;

/**
 * Created by hjz on 2017/12/22 0022.
 * 脱咖啡因咖啡
 */
public class Decaf extends Coffee {
    public Decaf()
    {
        super.setDescription("脱咖啡因咖啡");
        super.setPrice(3.0f);
    }
}
