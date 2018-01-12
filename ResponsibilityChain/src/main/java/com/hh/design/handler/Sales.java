package com.hh.design.handler;

import com.hh.design.base.PriceHandler;

/**
 * Created by hjz on 2018/1/12 0012.
 * 一线销售员， 可以批准5%以内的折扣
 */
public class Sales extends PriceHandler {

    public void processDiscount(float discount) {
        if (discount <= 0.05){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(), discount);
        }else{
            successor.processDiscount(discount);
        }
    }
}
