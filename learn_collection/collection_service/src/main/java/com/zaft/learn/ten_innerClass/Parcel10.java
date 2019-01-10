package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/7 0007.
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget");
                }
            }
            private String label = dest;
            public String readLine() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("p10",111f);
    }
}
