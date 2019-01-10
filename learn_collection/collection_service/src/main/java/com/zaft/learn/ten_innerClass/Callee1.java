package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/8 0008.
 */
public class Callee1 implements Incrementable{
    private int i=0;
    public void increment() {
        i++;
        System.out.println("Callee1 :"+i);
    }
}
