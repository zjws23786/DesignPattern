package com.hh.design.strategy.impl;


import com.hh.design.strategy.inter.FlyBehavior;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class BadFlyBehavior implements FlyBehavior {

    public void fly() {
        System.out.println("--BadFly--");
    }
}
