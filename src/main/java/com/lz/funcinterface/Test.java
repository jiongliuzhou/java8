package com.lz.funcinterface;

/**
 * @author lz
 * @create 2019/8/21
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args){
        show((Integer one,Integer two)->(one/two),1,2);
    }

    public static void show(Cal<Integer> c,Integer one,Integer two){
        System.out.println(c.calu(one,two));
    }
}
