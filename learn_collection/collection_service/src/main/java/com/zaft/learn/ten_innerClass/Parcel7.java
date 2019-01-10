package com.zaft.learn.ten_innerClass;

/**
 * 匿名内部类
 * Created by zaft_x on 2019/1/7 0007.
 * 10.6
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i=0;
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());
    }
}
