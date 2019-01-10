package com.zaft.learn.ten_innerClass;

/**
 * parcel :包裹，小包
 * destination:目的地，终点
 * Created by zaft_x on 2019/1/4 0004.
 */
public class Parcel1 {
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

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("big fish");
    }
}
