package com.hh.design.proxy.handler;

import com.hh.design.proxy.inte.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hjz on 2017/12/22 0022.
 * 别人访问的代码
 */
public class NonOwnerInvocationHandler implements InvocationHandler{
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")){
            return method.invoke(person,args);
        } else if (method.getName().equals("setHotOrNotRating")) {  //他人访问数据，只能进行打分，不能进行修改信息
            return method.invoke(person,args);
        }else if (method.getName().startsWith("set")){  //不能进行修改信息
            return new IllegalAccessException();
        }
        return null;
    }
}
