package com.hh.design.strategy.test;

import com.hh.design.strategy.base.Duck;
import com.hh.design.strategy.impl.NoFlyBehavior;
import com.hh.design.strategy.impl.NoQuackBehavior;
import com.hh.design.strategy.service.GreenHeadDuck;
import com.hh.design.strategy.service.RedHeadDuck;
import org.junit.Test;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class DuckTest {

    @Test
    public void test(){
        Duck redDuck = new RedHeadDuck();
        Duck greenDuck = new GreenHeadDuck();

        //红头鸭
        redDuck.display();
        redDuck.fly();
        redDuck.quack();

        //绿头鸭
        greenDuck.display();
        greenDuck.fly();
        greenDuck.quack();
        System.out.println("改变绿头鸭的行为");
        greenDuck.setFlyBehavior(new NoFlyBehavior());
        greenDuck.setQuackBehavior(new NoQuackBehavior());
        greenDuck.fly();
        greenDuck.quack();
    }
}
