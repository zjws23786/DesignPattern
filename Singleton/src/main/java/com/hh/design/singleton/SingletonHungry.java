package com.hh.design.singleton;

/**
 * Created by hjz on 2018/1/10 0010.
 * 单例 饿汉
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 区别：饿汉模式的特点是加载类时比较慢，但运行时获取对象的速度比较快，线程安全
 *      懒汉模式的特点是加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 */
public class SingletonHungry {
    //1.将构造方法私有化，不允许外部直接创建对象
    private SingletonHungry(){
    }

    //2.创建类的唯一实例，使用private static修饰
    private static SingletonHungry instance=new SingletonHungry();

    //3.提供一个用于获取实例的方法，使用public static修饰
    public static SingletonHungry getInstance(){
        return instance;
    }
}
