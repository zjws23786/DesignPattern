package com.hh.design.decorator.season_decorator;

import com.hh.design.decorator.base.Drink;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
