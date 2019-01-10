package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/4 0004.
 */
public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value(){
            return 1;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){return label;}
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("big fish");
        Parcel2 p1 = new Parcel2();
        Parcel2.Contents c = p1.contents();
        Parcel2.Destination d = p1.to("little fish");
        System.out.println(d.readLabel());
    }
}
