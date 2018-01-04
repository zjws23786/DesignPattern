package com.hh.design.proxy.handler;

import com.hh.design.proxy.inte.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hjz on 2017/12/22 0022.
 * 自己设置代理
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.person = personBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")){
            return method.invoke(person,args);
        }else if (method.getName().equals("setHotOrNotRating")){  //自己不能给自己打分，但可以修改自己相关信息
            return new IllegalAccessException();
        }else if (method.getName().startsWith("set")){
            return method.invoke(person,args);
        }
        return null;
    }
}
