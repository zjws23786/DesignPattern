package com.hh.design.strategy.service;

import com.hh.design.strategy.base.Duck;
import com.hh.design.strategy.impl.BadFlyBehavior;
import com.hh.design.strategy.impl.GeGeQuackBehavior;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    public void display() {
        System.out.println("**RedHead**");
    }
}
