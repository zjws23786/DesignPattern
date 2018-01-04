package com.hh.design.strategy.base;


import com.hh.design.strategy.inter.FlyBehavior;
import com.hh.design.strategy.inter.QuackBehavior;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void fly(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public void quack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
