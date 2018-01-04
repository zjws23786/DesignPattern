package com.hh.design.strategy.impl;

import com.hh.design.strategy.inter.QuackBehavior;

/**
 * Created by hjz on 2017/12/22 0022.
 * 鸭子叫 行为
 */
public class GaGaQuackBehavior implements QuackBehavior{

    public void quack() {
        System.out.println("__GaGa__");
    }
}
