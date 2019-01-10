package com.zaft.learn.polymorphic;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind.play()"+n);
    }
}
