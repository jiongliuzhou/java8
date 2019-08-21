package com.lz.defaultmethod;

/**
 * 轿车
 * @author lz
 * @create 2019/8/21
 * @since 1.0.0
 */
public class Car implements Vehicle,FourWheeler{
    public void print(){
        Vehicle.super.print();
        Vehicle.super.print1();
        FourWheeler.super.print();
        FourWheeler.show();
    }

    public static void main(String[] args){
        FourWheeler v=new Car();
        v.print();
    }
}
