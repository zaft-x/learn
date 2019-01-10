package com.zaft.learn.polymorphic;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Brass extends Instrument {
    public void play(Note n){
        System.out.println("Brass.play()"+n);
    }
}
