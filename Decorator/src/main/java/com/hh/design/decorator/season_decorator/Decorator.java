package com.hh.design.decorator.season_decorator;

import com.hh.design.decorator.base.Drink;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescription() {
        return super.description + " 价格 " + super.getPrice() +
             " ~~~~~~~~~ "+obj.getDescription();
    }
}
