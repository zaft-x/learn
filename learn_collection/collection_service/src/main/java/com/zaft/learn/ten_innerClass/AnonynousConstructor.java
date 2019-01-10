package com.zaft.learn.ten_innerClass;

/**
 * anonymous：匿名的，无名的
 * Created by zaft_x on 2019/1/7 0007.
 */
public class AnonynousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("inside instance initzlizer");
            }
            @Override
            public void f() {
                System.out.println("in Anonynous f()");
            }
        };
    }
    public static void main(String[] args) {
        Base base = getBase(2);
        base.f();
    }
}
