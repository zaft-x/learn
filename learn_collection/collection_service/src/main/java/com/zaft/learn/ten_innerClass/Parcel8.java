package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/7 0007.
 * 10.6
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value()*47;
            }
        };
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(2);
        System.out.println(w.value());
    }
}
