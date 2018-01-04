package com.hh.design.strategy.service;

import com.hh.design.strategy.base.Duck;
import com.hh.design.strategy.impl.GaGaQuackBehavior;
import com.hh.design.strategy.impl.GoodFlyBehavior;

/**
 * Created by hjz on 2017/12/22 0022.
 * 业务层
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    public void display() {
        System.out.println("**GreenHead**");
    }
}
