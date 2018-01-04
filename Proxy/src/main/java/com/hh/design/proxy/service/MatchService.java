package com.hh.design.proxy.service;

import com.hh.design.proxy.handler.NonOwnerInvocationHandler;
import com.hh.design.proxy.handler.OwnerInvocationHandler;
import com.hh.design.proxy.impl.PersonBeanImpl;
import com.hh.design.proxy.inte.PersonBean;

import java.lang.reflect.Proxy;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class MatchService {

    public MatchService() {
        PersonBean joe = getPersonInfo("joe", "male", "running");

        //自个只能修改自个信息，不能进行给自己打分
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        System.out.println("Interests is " + ownerProxy.getInterests());
        ownerProxy.setInterests("Bowling");
        System.out.println("Interests are " + ownerProxy.getInterests());

        ownerProxy.setHotOrNotRating(50);
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        ownerProxy.setHotOrNotRating(40);
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        System.out.println("**************");

        //他人只能进行打分，不能修改信息
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setInterests("haha");
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setHotOrNotRating(60);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getPersonInfo(String name,String gender,String interests){
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setGender(gender);
        person.setInterests(interests);
        return person;
    }

    PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass()
        .getClassLoader(),person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass()
        .getClassLoader(),person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
