package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/4 0004.
 * 10.3
 */
public class Parcel3 {
    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLine(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p3 = new Parcel3();
        Parcel3.Contents c = p3.new Contents();
        Parcel3.Destination d = p3.new Destination(" p3");
        System.out.println(d.readLine());
    }
}
