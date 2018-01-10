package com.hh.design.singleton;

/**
 * Created by hjz on 2018/1/10 0010.
 */
public class SingletonTest {

    public static void main(String[] args) {
        //饿汉模式
        SingletonHungry s1 = SingletonHungry.getInstance();
        SingletonHungry s2 = SingletonHungry.getInstance();
        if(s1==s2){
            System.out.println("s1和s2是同一个实例");
        }else{
            System.out.println("s1和s2不是同一个实例");
        }

        //懒汉模式
        SingletonLazy s3 = SingletonLazy.getInstance();
        SingletonLazy s4 = SingletonLazy.getInstance();
        if(s3==s4){
            System.out.println("s3和s4是同一个实例");
        }else{
            System.out.println("S3和s4不是同一个实例");
        }

    }
}
