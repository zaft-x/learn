package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/7 0007.
 */
public class Parcel11 {
    private static class ParcelContents implements Contents{
        private int i = 1;
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{
        private String label;
        ParcelDestination(String whereTo){
            label = whereTo;
        }
        public String readLine() {
            return label;
        }
        private static void f(){}
        static int x= 10;
        static class AnotherLevel{
            public static void f(){}
            static int x=10;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
    public static Contents contents(){
        return new ParcelContents();
    }
    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("s");
    }
}
