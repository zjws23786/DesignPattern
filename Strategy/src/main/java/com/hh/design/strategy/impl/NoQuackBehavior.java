package com.hh.design.strategy.impl;

import com.hh.design.strategy.inter.QuackBehavior;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class NoQuackBehavior implements QuackBehavior {
    public void quack() {
        System.out.println("__NoQuack__");
    }
}
