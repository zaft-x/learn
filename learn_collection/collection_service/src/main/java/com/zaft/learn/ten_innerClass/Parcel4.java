package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/4 0004.
 * 10.4
 */
public class Parcel4 {
    private class PContents implements Contents{
        private int i=11;
        public int value() {
            return i;
        }
    }

    private class PDestinetion implements Destination{
        private String label;
        public PDestinetion(String whereTo){
            label = whereTo;
        }
        public String readLine() {
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestinetion(s);
    }
    public Contents contents(){
        return new PContents();
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("p4");

        PContents c1 = p.new PContents();
        PDestinetion d1 = p.new PDestinetion("p4p");
    }
}
