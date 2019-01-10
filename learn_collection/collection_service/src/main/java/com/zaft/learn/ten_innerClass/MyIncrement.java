package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/8 0008.
 */
public class MyIncrement {
    public void increment(){
        System.out.println("another operation");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}
