package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/7 0007.
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            public String readLine() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("p9");
    }
}
