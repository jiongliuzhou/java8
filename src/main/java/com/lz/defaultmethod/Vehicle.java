package com.lz.defaultmethod;

/**
 * 我是一辆车
 * @author lz
 * @create 2019/8/21
 * @since 1.0.0
 */
public interface Vehicle {
    default void print(){
        System.out.println("我是一辆车");
    }

    default void print1(){
        System.out.println("我是一辆车1");
    }
}
