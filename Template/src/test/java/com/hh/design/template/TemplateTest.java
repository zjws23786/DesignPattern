package com.hh.design.template;

import com.hh.design.template.base.RefreshBeverage;
import com.hh.design.template.service.Coffee;
import com.hh.design.template.service.Tea;

/**
 * Created by hjz on 2018/1/10 0010.
 */
public class TemplateTest {

    public static void main(String[] args) {

        System.out.println("制备咖啡...");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("咖啡好了！");

        System.out.println("\n******************************************");

        System.out.println("制备茶...");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶好了！");

    }
}
