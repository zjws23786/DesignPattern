package com.hh.design.decorator.test;

import com.hh.design.decorator.base.Drink;
import com.hh.design.decorator.coffee_type.Decaf;
import com.hh.design.decorator.coffee_type.LongBlack;
import com.hh.design.decorator.season_decorator.Chocolate;
import com.hh.design.decorator.season_decorator.Milk;
import org.junit.Test;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class CoffeeTest {

    @Test
    public void test(){
        Drink order = new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());

        System.out.println("****************");
        order=new LongBlack();
        //往美式咖啡中添加牛奶
        order=new Milk(order);
        //往美式咖啡中再添加巧克力
        order=new Chocolate(order);
        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 desc:"+order.getDescription());
    }
}
