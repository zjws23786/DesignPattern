package com.hh.design.strategy.impl;

import com.hh.design.strategy.inter.FlyBehavior;

/**
 * Created by hjz on 2017/12/22 0022.
 * 鸭子飞的好 行为实现
 */
public class GoodFlyBehavior implements FlyBehavior {

    public void fly() {
        System.out.println("--GoodFly--");
    }
}
