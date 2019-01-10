package com.zaft.learn.ten_innerClass;

/**
 * dot：点,圆点。 v/n
 * Created by zaft_x on 2019/1/4 0004.
 * 10.3
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args) {
            DotThis dt = new DotThis();
            DotThis.Inner dti = dt.inner();
            dti.outer().f();
    }
}
