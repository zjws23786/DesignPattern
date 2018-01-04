package com.hh.design.decorator.base;

/**
 * Created by hjz on 2017/12/22 0022.
 * 中间转发层
 */
public class Coffee extends Drink {
    public float cost() {
        return super.getPrice();
    }
}
