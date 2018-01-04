package com.hh.design.decorator.season_decorator;

import com.hh.design.decorator.base.Drink;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("巧克力");
        super.setPrice(3.0f);
    }
}
