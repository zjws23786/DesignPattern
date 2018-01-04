package com.hh.design.proxy.impl;

import com.hh.design.proxy.inte.PersonBean;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int rating;   //打分
    int ratingcount=0;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getInterests() {
        return interests;
    }

    public int getHotOrNotRating() {
        if (ratingcount == 0){
            return 0;
        }
        return rating/ratingcount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setHotOrNotRating(int rating) {
        this.rating = rating;
        ratingcount++;
    }
}
