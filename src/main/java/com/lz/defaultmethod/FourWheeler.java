package com.lz.defaultmethod;

/**
 * 我是一辆四轮车
 * @author lz
 * @create 2019/8/21
 * @since 1.0.0
 */
public interface FourWheeler{
    //接口默认方法
    default void print(){
        System.out.println("我是一辆四轮车");
    }

    //接口静态方法
    static void show(){
        System.out.println("我是一个静态方法");
    }
}
