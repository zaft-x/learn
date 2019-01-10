package com.zaft.learn.ten_innerClass;

/**
 * internal ： 内部的，体内的
 *
 * Created by zaft_x on 2019/1/4 0004.
 * 10.5
 */
public class Parcel6 {

    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id=s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
           // ts.getSlip();
            System.out.println(ts.getSlip());
        }
    }

    public void track(){internalTracking(true);}
    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
