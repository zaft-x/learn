package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/4 0004.
 * 10.5
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            public String readLine() {
                return label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("p5");
    }
}
