package com.hh.design.singleton;

/**
 * Created by hjz on 2018/1/10 0010.
 * 单例 懒汉
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 区别：饿汉模式的特点是加载类时比较慢，但运行时获取对象的速度比较快，线程安全
 *      懒汉模式的特点是加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 */
public class SingletonLazy {
    //1.将构造方式私有化，不允许外边直接创建对象
    private SingletonLazy(){
    }

    //2.声明类的唯一实例，使用private static修饰
    private static SingletonLazy instance;

    //3.提供一个用于获取实例的方法，使用public static修饰
    public static SingletonLazy getInstance(){
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}
