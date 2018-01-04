package com.hh.design.decorator.season_decorator;

import com.hh.design.decorator.base.Drink;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }
}
