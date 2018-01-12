package com.hh.design.client;

import com.hh.design.base.PriceHandler;

/**
 * Created by hjz on 2018/1/12 0012.
 * 客户，请求折扣
 */
public class Customer {
    private PriceHandler priceHandler;

    public void requestDiscount(float discount){
        if (priceHandler != null){
            priceHandler.processDiscount(discount);
        }
    }

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }
}
