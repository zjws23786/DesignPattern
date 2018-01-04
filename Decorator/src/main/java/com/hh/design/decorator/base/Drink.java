package com.hh.design.decorator.base;

/**
 * Created by hjz on 2017/12/22 0022.
 * 计算咖啡价格
 */
public abstract class Drink {
    public String description = "";
    private float price;

    //计算价格
    public abstract float cost();

    public String getDescription() {
        return description+" 价格 "+this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
